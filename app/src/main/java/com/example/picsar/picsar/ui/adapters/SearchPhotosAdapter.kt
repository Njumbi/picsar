package com.example.picsar.picsar.ui.adapters

import android.content.Intent
import android.graphics.drawable.Drawable
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
import com.example.picsar.picsar.SearchPhotoDetailsActivity
import com.example.picsar.picsar.domain.PhotosItem
import kotlinx.android.synthetic.main.list_item_random_photos.view.*

class SearchPhotosAdapter : RecyclerView.Adapter<SearchPhotosAdapter.SearchPhotosAdapterVh>() {
    private val data = arrayListOf<PhotosItem?>()

    fun setData(list: List<PhotosItem?>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

    fun clear() {
        data.clear()
        notifyDataSetChanged()
    }

    class SearchPhotosAdapterVh(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchPhotosAdapterVh {
        return SearchPhotosAdapterVh(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item_random_photos, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SearchPhotosAdapterVh, position: Int) {
        val requestOptions = RequestOptions()
        requestOptions.error(R.drawable.smiley)

        holder.itemView.pb_random.visibility = View.VISIBLE


        Glide.with(holder.itemView.context)
            .setDefaultRequestOptions(requestOptions)
            .load(data[position]?.imageLinks?.small)
            .listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    holder.itemView.pb_random.visibility = View.GONE
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: com.bumptech.glide.load.DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    holder.itemView.pb_random.visibility = View.GONE
                    return false
                }


            })
            .into(holder.itemView.iv_random_picture)

        holder.itemView.iv_random_picture.setOnClickListener {
            val intent = Intent(holder.itemView.context, SearchPhotoDetailsActivity::class.java)
            intent.putExtra("searchData", data[position])
            holder.itemView.context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return data.size
    }
}