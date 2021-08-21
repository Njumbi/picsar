package com.example.picsar.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.picsar.R
import com.example.picsar.ui.data.model.PhotosResponseItem
import kotlinx.android.synthetic.main.list_item_random_photos.view.*

class SearchPhotosAdapter:RecyclerView.Adapter<SearchPhotosAdapter.SearchPhotosAdapterVh>() {
    private val data = arrayListOf<PhotosResponseItem?>()

    fun setData(list: List<PhotosResponseItem?>){
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }
    fun clear(){
        data.clear()
        notifyDataSetChanged()
    }

    class SearchPhotosAdapterVh(view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchPhotosAdapterVh {
      return SearchPhotosAdapterVh(
          LayoutInflater.from(parent.context).inflate(R.layout.list_item_random_photos,parent,false)
      )
    }

    override fun onBindViewHolder(holder: SearchPhotosAdapterVh, position: Int) {
        Glide
            .with(holder.itemView.context)
            .load(data[position]?.urls?.small)
            .centerCrop()
            .placeholder(R.drawable.user)
            .into(holder.itemView.iv_random_picture);
    }

    override fun getItemCount(): Int {
      return data.size
    }
}