package com.example.picsar.ui.adapters

import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.picsar.R
import com.example.picsar.ui.data.model.PhotosResponseItem
import com.example.picsar.ui.fragments.TimeAgo
import kotlinx.android.synthetic.main.item_list_photos.view.*


class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeAdapterVH>() {

    private val data = arrayListOf<PhotosResponseItem>()

    fun setData(list: List<PhotosResponseItem>) {
        data.clear()
        data.addAll(list)
        notifyDataSetChanged()
    }

    fun clear() {
        data.clear()
        notifyDataSetChanged()
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

        Glide
            .with(holder.itemView.context)
            .load(data[position].user?.profileImage?.medium)
            .centerCrop()
            .placeholder(R.drawable.user)
            .into(holder.itemView.iv_profile_image);


        Glide
            .with(holder.itemView.context)
            .load(data[position].urls?.small)
            .centerCrop()
            .placeholder(android.R.color.darker_gray)
            .into(holder.itemView.iv_picture);


    }

    override fun getItemCount(): Int {
        return data.size
    }

}
