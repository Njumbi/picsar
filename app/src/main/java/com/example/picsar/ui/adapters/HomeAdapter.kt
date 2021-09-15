package com.example.picsar.ui.adapters

import android.app.PendingIntent.getActivity
import android.content.Intent
import android.graphics.drawable.Drawable
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.example.picsar.R
import com.example.picsar.ui.data.model.PhotosResponseItem
import com.example.picsar.ui.fragments.HomeFragment
import com.example.picsar.ui.fragments.TimeAgo
import kotlinx.android.synthetic.main.item_list_photos.view.*
import com.example.picsar.ui.AdapterListener
import com.example.picsar.ui.WallpaperActivity
import kotlinx.android.synthetic.main.item_list_photos.*
import kotlinx.android.synthetic.main.list_item_random_photos.view.*
import java.security.AccessController.getContext


class HomeAdapter(homeFragment: HomeFragment) : RecyclerView.Adapter<HomeAdapter.HomeAdapterVH>() {

    private val data = arrayListOf<PhotosResponseItem>()
    private var listener: AdapterListener? = null

    fun setData(list: List<PhotosResponseItem>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

    fun clear() {
        data.clear()
        notifyDataSetChanged()
    }

    fun setListener( listener: AdapterListener ){
        this.listener = listener
    }

    class HomeAdapterVH(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapterVH {
        return HomeAdapterVH(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_photos, parent, false)
        )
    }

    override fun onBindViewHolder(holder: HomeAdapterVH, position: Int) {
        var userName = data[position].user?.username
        holder.itemView.tv_username.text = data[position].user?.username
        holder.itemView.tv_description.text = data[position].user?.username + " " + data[position].altDescription
        userName = "<font color='#00000'> ${userName}</font>"
        var userNameBold = "<b>$userName</b> ";
        if( data[position].altDescription.isNullOrEmpty()){

            holder.itemView.tv_description.text =Html.fromHtml("$userNameBold photography is the story I fail to put in words. ")

        }else{

            holder.itemView.tv_description.text = Html.fromHtml(userNameBold + " " + data[position].altDescription)

        }

        var timeAgo =data[position].updatedAt
        holder.itemView.tv_createdAt.text =  TimeAgo.covertTimeToText( timeAgo )

        holder.itemView.iv_picture.setOnClickListener {
            val intent = Intent(holder.itemView.context, WallpaperActivity::class.java)
            intent.putExtra("data", data[position])
            holder.itemView.context. startActivity(intent)
        }

        val requestOptions = RequestOptions()
        requestOptions.error(R.drawable.smiley)
            holder.itemView.pb_home_page.visibility = View.VISIBLE
        Glide
            .with(holder.itemView.context)
            .load(data[position].user?.profileImage?.medium)
            .centerCrop()
            .placeholder(R.drawable.user)
            .into(holder.itemView.iv_profile_image);


        Glide.with(holder.itemView.context)
            .setDefaultRequestOptions(requestOptions)
            .load(data[position]?.urls?.small)
            .listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    holder.itemView.pb_home_page.visibility  =View.GONE
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: com.bumptech.glide.load.DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    holder.itemView.pb_home_page.visibility  =View.GONE
                    return false
                }


            })
            .into(holder.itemView.iv_picture)





        holder.itemView.iv_favorite.setOnClickListener {
            listener?.myListener( data[position])

                if ( holder.itemView.iv_favorite.drawable.constantState == holder.itemView.getContext().getResources().getDrawable(R.drawable.baseline_favorite_red_500_24dp)?.constantState) {
                    val mDrawable: Drawable =
                        holder.itemView.getContext() .getResources().getDrawable(R.drawable.baseline_favorite_border_black_24dp)
                         holder.itemView.iv_favorite.setImageDrawable(mDrawable)


                } else {
                    val mDrawable: Drawable =
                        holder.itemView.getContext().getResources().getDrawable(R.drawable.baseline_favorite_red_500_24dp)
                    holder.itemView.iv_favorite.setImageDrawable(mDrawable)

                }
            }

        holder.itemView.saved.setOnClickListener{
            listener?.myListener(data[position])
            if ( holder.itemView.saved.drawable.constantState == holder.itemView.getContext().getResources().getDrawable(R.drawable.baseline_turned_in_black_36dp)?.constantState){

                val mDrawable: Drawable = holder.itemView.getContext().getResources().getDrawable(R.drawable.baseline_turned_in_white_36dp)
                holder.itemView.saved.setImageDrawable(mDrawable)

            }else{

                    val mDrawable: Drawable =
                        holder.itemView.getContext().getResources().getDrawable(R.drawable.baseline_turned_in_black_36dp)
                holder.itemView.saved.setImageDrawable(mDrawable)
            }

        }




    }

    override fun getItemCount(): Int {
        return data.size
    }

}
