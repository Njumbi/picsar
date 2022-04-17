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
import com.example.picsar.picsar.ExploreActivity
import com.example.picsar.picsar.domain.TopicItem
import kotlinx.android.synthetic.main.list_item_random_photos.view.*


class SearchAdapter : RecyclerView.Adapter<SearchAdapter.SearchAdapterVh>() {
    private val data = arrayListOf<TopicItem?>()

    fun setData(list: List<TopicItem?>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

    class SearchAdapterVh(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SearchAdapterVh {
        return SearchAdapterVh(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item_random_photos, parent, false)
        )
    }

    override fun onBindViewHolder(holder: SearchAdapterVh, position: Int) {
        val requestOptions = RequestOptions()
        requestOptions.error(R.drawable.smiley)


        holder.itemView.pb_random.visibility = View.VISIBLE
        Glide.with(holder.itemView.context)
            .setDefaultRequestOptions(requestOptions)
            .load(data[position]?.coverPhotoImage?.topicUrlsLinks?.small)
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
            val intent = Intent(holder.itemView.context, ExploreActivity::class.java)
            intent.putExtra("exploreData", data[position])
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }
}