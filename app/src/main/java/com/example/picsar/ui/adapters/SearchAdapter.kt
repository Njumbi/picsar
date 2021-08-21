package com.example.picsar.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.picsar.R
import com.example.picsar.ui.data.model.PhotosResponse
import com.example.picsar.ui.data.model.PhotosResponseItem
import com.example.picsar.ui.data.model.TopicResponseItem
import kotlinx.android.synthetic.main.list_item_random_photos.view.*

class SearchAdapter : RecyclerView.Adapter<SearchAdapter.SearchAdapterVh>() {
    private val data = arrayListOf<TopicResponseItem?>()

    fun setData(list: List<TopicResponseItem?>){
        data.clear()
        if (list != null) {
            data.addAll(list)
        }
        notifyDataSetChanged()
    }

    class SearchAdapterVh(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SearchAdapterVh {
        return SearchAdapterVh(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item_random_photos,parent,false)
        )
    }

    override fun onBindViewHolder(holder: SearchAdapterVh, position: Int) {
        Glide
            .with(holder.itemView.context)
            .load(data[position]?.coverPhoto?.urls?.small)
            .centerCrop()
            .placeholder(R.drawable.user)
            .into(holder.itemView.iv_random_picture);

    }

    override fun getItemCount(): Int {
    return data.size
    }
}