package com.example.picsar.ui

import android.app.WallpaperManager
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.picsar.R
import com.example.picsar.ui.data.model.PhotosResponseItem
import kotlinx.android.synthetic.main.activity_search_photo_details_activity.*
import kotlinx.android.synthetic.main.activity_wallpaper.*
import java.io.IOException

class SearchPhotoDetailsActivity : AppCompatActivity() {
    lateinit var searchData : PhotosResponseItem
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_photo_details_activity)

        searchData = intent.getSerializableExtra("searchData") as PhotosResponseItem

        tl_search_wallpaper.showOverflowMenu()
        setSupportActionBar(tl_search_wallpaper)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)


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
            .load(searchData.urls?.raw)
            .apply(requestOptions)
            .transition(DrawableTransitionOptions.withCrossFade())
            .centerCrop()
            .into(iv_search_wallpaper)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
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
                        .load(searchData?.urls?.regular)
                        .into(object : SimpleTarget<Bitmap?>() {
                            override fun onResourceReady(
                                resource: Bitmap,
                                transition: Transition<in Bitmap?>?
                            ) {
                                wallManager.setBitmap(resource)
                                Toast.makeText(
                                    this@SearchPhotoDetailsActivity,
                                    "Wallpaper Set Successfully!!",
                                    Toast.LENGTH_SHORT
                                ).show()
                                finish()
                            }
                        })
                } catch (e: IOException) {
                    Toast.makeText(
                        this,
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
                        .load(searchData?.urls?.regular)
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
                                    this@SearchPhotoDetailsActivity,
                                    "Lock Screen set Successfully!",
                                    Toast.LENGTH_SHORT
                                ).show()
                                finish()
                            }
                        })
                } catch (e: IOException) {
                    Toast.makeText(
                        this,
                        "Lock Screen set Failed",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            R.id.nav_both -> {
                val wallManager = WallpaperManager.getInstance(this)
                try {
                    Glide.with(this)
                        .asBitmap()
                        .load(searchData?.urls?.regular)
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
                                    this@SearchPhotoDetailsActivity,
                                    "Home and Lock Screen Set Successfully!!",
                                    Toast.LENGTH_SHORT
                                ).show()
                                finish()
                            }
                        })
                } catch (e: IOException) {
                    Toast.makeText(
                        this,
                        "Home and Lock Screen Setting Failed!!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            R.id.share -> {

                Glide.with(this)
                    .asBitmap()
                    .load(searchData?.urls?.regular)
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
                            Toast.makeText(this@SearchPhotoDetailsActivity, "Something went wrong", Toast.LENGTH_SHORT).show();
                            super.onLoadFailed(errorDrawable)
                        }

                        override fun onLoadStarted(placeholder: Drawable?) {
                            Toast.makeText(this@SearchPhotoDetailsActivity, "Starting", Toast.LENGTH_SHORT).show();
                            super.onLoadStarted(placeholder)
                        }
                    })


            }


        }
        return super.onOptionsItemSelected(item)
    }
}