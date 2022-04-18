package com.example.picsar.picsar.ui.activities

import android.app.WallpaperManager
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.picsar.R
import com.example.picsar.picsar.domain.PhotosItem
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_wallpaper.*
import java.io.IOException

@AndroidEntryPoint
class WallpaperActivity : AppCompatActivity() {

    lateinit var photoResponseItem: PhotosItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallpaper)


        tl_wallpaper.showOverflowMenu()
        setSupportActionBar(tl_wallpaper)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)


        photoResponseItem = intent.getParcelableExtra("data")!!

        val circularProgressDrawable = CircularProgressDrawable(this)
        circularProgressDrawable.strokeWidth = 5f
        circularProgressDrawable.centerRadius = 30f
        circularProgressDrawable.start()

        val requestOptions = RequestOptions()
        requestOptions.placeholder(circularProgressDrawable)
        requestOptions.error(R.drawable.smiley)
        requestOptions.skipMemoryCache(true)
        requestOptions.fitCenter()




        Glide
            .with(this)
            .load(photoResponseItem.imageLinks?.raw)
            .apply(requestOptions)
            .transition(DrawableTransitionOptions.withCrossFade())
            .centerCrop()
            .into(iv_wallpaper)


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.settings, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
            R.id.nav_settings -> {
                val wallManager = WallpaperManager.getInstance(
                    applicationContext
                )
                try {
                    Glide.with(this)
                        .asBitmap()
                        .load(photoResponseItem?.imageLinks?.regular)
                        .into(object : SimpleTarget<Bitmap?>() {
                            override fun onResourceReady(
                                resource: Bitmap,
                                transition: Transition<in Bitmap?>?
                            ) {
                                wallManager.setBitmap(resource)
                                Toast.makeText(
                                    this@WallpaperActivity,
                                    "Wallpaper Set Successfully!!",
                                    Toast.LENGTH_SHORT
                                ).show()
                                finish()
                            }
                        })
                } catch (e: IOException) {
                    Toast.makeText(
                        this@WallpaperActivity,
                        "Setting WallPaper Failed!!",
                        Toast.LENGTH_SHORT
                    ).show()
                }

            }
            R.id.nav_lockScreen -> {
                val wallManager = WallpaperManager.getInstance(this)
                try {
                    Glide.with(this)
                        .asBitmap()
                        .load(photoResponseItem?.imageLinks?.regular)
                        .into(object : SimpleTarget<Bitmap?>() {
                            @RequiresApi(Build.VERSION_CODES.N)
                            override fun onResourceReady(
                                resource: Bitmap,
                                transition: Transition<in Bitmap?>?
                            ) {
                                wallManager.setBitmap(resource)
                                wallManager.setBitmap(
                                    resource,
                                    null,
                                    true,
                                    WallpaperManager.FLAG_LOCK
                                )
                                Toast.makeText(
                                    this@WallpaperActivity,
                                    "Lock Screen Set Successfully!!",
                                    Toast.LENGTH_SHORT
                                ).show()
                                finish()
                            }
                        })
                } catch (e: IOException) {
                    Toast.makeText(
                        this@WallpaperActivity,
                        "Setting Lock Screen Failed!!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            R.id.nav_both -> {
                val wallManager = WallpaperManager.getInstance(this)
                try {
                    Glide.with(this)
                        .asBitmap()
                        .load(photoResponseItem?.imageLinks?.regular)
                        .into(object : SimpleTarget<Bitmap?>() {
                            @RequiresApi(Build.VERSION_CODES.N)
                            override fun onResourceReady(
                                resource: Bitmap,
                                transition: Transition<in Bitmap?>?
                            ) {
                                wallManager.setBitmap(
                                    resource,
                                    null,
                                    true,
                                    WallpaperManager.FLAG_LOCK
                                )
                                Toast.makeText(
                                    this@WallpaperActivity,
                                    "Home and lock screen Set Successfully!!",
                                    Toast.LENGTH_SHORT
                                ).show()
                                finish()
                            }
                        })
                } catch (e: IOException) {
                    Toast.makeText(
                        this@WallpaperActivity,
                        "Home and lock screen Failed!!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            R.id.share -> {

                Glide.with(this)
                    .asBitmap()
                    .load(photoResponseItem?.imageLinks?.regular)
                    .skipMemoryCache(true)
                    .diskCacheStrategy(DiskCacheStrategy.NONE)
                    .into(object : SimpleTarget<Bitmap?>() {
                        override fun onResourceReady(
                            resource: Bitmap,
                            transition: Transition<in Bitmap?>?
                        ) {

                            intent = Intent(Intent.ACTION_SEND);
                            intent.putExtra(Intent.EXTRA_TEXT, "Hey view/download this image");
                            val path = MediaStore.Images.Media.insertImage(getContentResolver(), resource, "", null);

                           val screenshotUri = Uri.parse(path);
                            intent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
                            intent.type = "image/*";

                            startActivity(Intent.createChooser(intent, "Share image via..."));
                        }


                        override fun onLoadFailed(errorDrawable: Drawable?) {
                            Toast.makeText(this@WallpaperActivity, "Something went wrong", Toast.LENGTH_SHORT).show();
                            super.onLoadFailed(errorDrawable)
                        }

                        override fun onLoadStarted(placeholder: Drawable?) {
                            Toast.makeText(this@WallpaperActivity, "Starting", Toast.LENGTH_SHORT).show();
                            super.onLoadStarted(placeholder)
                        }
                    })

                // code for sharing image as a link
//                try {
//                    val clipboard: ClipboardManager =
//                        getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
//                    val clip = ClipData.newPlainText("url", photoResponseItem?.urls?.regular)
//                    clipboard.setPrimaryClip(clip)
//
//                    val shareIntent: Intent = Intent().apply {
//                        action = Intent.ACTION_SEND
//                        putExtra(Intent.EXTRA_TEXT, clip)
//
//                        val imageUri = photoResponseItem?.urls?.regular
//
//                        putExtra(Intent.EXTRA_STREAM, imageUri.toString())
//                        type = "image/jpeg"
//                    }
//                    startActivity(
//                        Intent.createChooser(
//                            shareIntent,
//                            resources.getText(R.string.share)
//                        )
//                    )
//
//                } catch (e: IOException) {
//
//                }


            }


        }
        return super.onOptionsItemSelected(item)
    }


}