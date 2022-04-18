package com.example.picsar.picsar.ui.adapters

import android.content.Intent
import android.graphics.drawable.Drawable
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import com.example.picsar.R
import com.example.picsar.picsar.ui.activities.WallpaperActivity
import com.example.picsar.picsar.domain.PhotosItem
import com.example.picsar.picsar.ui.fragments.TimeAgo
import kotlinx.android.synthetic.main.item_list_photos.view.*


class HomeAdapter() : RecyclerView.Adapter<HomeAdapter.HomeAdapterVH>() {

    private val data = arrayListOf<PhotosItem>()
    private var listener: AdapterListener? = null

    fun setData(list: List<PhotosItem>) {
        data.clear()
        data.addAll(list)
        this.notifyDataSetChanged()
    }

    fun clear() {
        data.clear()
        notifyDataSetChanged()
    }

    fun setListener(listener: AdapterListener) {
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
        var userName = data[position].photographerDetails?.photographerName
        holder.itemView.tv_username.text = data[position].photographerDetails?.photographerName
        holder.itemView.tv_description.text =
            data[position].photographerDetails?.photographerName + " " + data[position].imageDescription
        userName = "<font color='#00000'> ${userName}</font>"
        var userNameBold = "<b>$userName</b> ";
        if (data[position].imageDescription.isNullOrEmpty()) {

            holder.itemView.tv_description.text =
                Html.fromHtml("$userNameBold photography is the story I fail to put in words. ")

        } else {

            holder.itemView.tv_description.text =
                Html.fromHtml(userNameBold + " " + data[position].imageDescription)

        }

        var timeAgo = data[position].upDatedTime
        holder.itemView.tv_createdAt.text = TimeAgo.covertTimeToText(timeAgo)

        holder.itemView.iv_picture.setOnClickListener {
            val intent = Intent(holder.itemView.context, WallpaperActivity::class.java)
            intent.putExtra("data", data[position])
            holder.itemView.context.startActivity(intent)
        }

        val requestOptions = RequestOptions()
        requestOptions.error(R.drawable.smiley)
        holder.itemView.pb_home_page.visibility = View.VISIBLE
        Glide.with(holder.itemView.context)
            .load(data[position].photographerDetails?.profileImage?.medium).centerCrop()
            .placeholder(R.drawable.user).into(holder.itemView.iv_profile_image);


        Glide.with(holder.itemView.context).setDefaultRequestOptions(requestOptions)
            .load(data[position]?.imageLinks?.small).listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    holder.itemView.pb_home_page.visibility = View.GONE
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: com.bumptech.glide.load.DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    holder.itemView.pb_home_page.visibility = View.GONE
                    return false
                }


            }).into(holder.itemView.iv_picture)





        holder.itemView.iv_favorite.setOnClickListener {
            listener?.myListener(data[position])

            if (holder.itemView.iv_favorite.drawable.constantState == holder.itemView.getContext()
                    .getResources()
                    .getDrawable(R.drawable.baseline_favorite_red_500_24dp)?.constantState
            ) {
                val mDrawable: Drawable = holder.itemView.getContext().getResources()
                    .getDrawable(R.drawable.baseline_favorite_border_black_24dp)
                holder.itemView.iv_favorite.setImageDrawable(mDrawable)


            } else {
                val mDrawable: Drawable = holder.itemView.getContext().getResources()
                    .getDrawable(R.drawable.baseline_favorite_red_500_24dp)
                holder.itemView.iv_favorite.setImageDrawable(mDrawable)

            }
        }

        holder.itemView.saved.setOnClickListener {
            listener?.myListener(data[position])
            if (holder.itemView.saved.drawable.constantState == holder.itemView.getContext()
                    .getResources()
                    .getDrawable(R.drawable.baseline_turned_in_black_36dp)?.constantState
            ) {

                val mDrawable: Drawable = holder.itemView.getContext().getResources()
                    .getDrawable(R.drawable.baseline_turned_in_white_36dp)
                holder.itemView.saved.setImageDrawable(mDrawable)

            } else {

                val mDrawable: Drawable = holder.itemView.getContext().getResources()
                    .getDrawable(R.drawable.baseline_turned_in_black_36dp)
                holder.itemView.saved.setImageDrawable(mDrawable)
            }

        }


    }

    override fun getItemCount(): Int {
        return data.size
    }

}
