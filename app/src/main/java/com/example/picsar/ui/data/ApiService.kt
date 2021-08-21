package com.example.picsar.ui.data

import com.example.picsar.ui.ACCESS_KEY
import com.example.picsar.ui.data.model.PhotosResponse
import com.example.picsar.ui.data.model.SearchResponse
import com.example.picsar.ui.data.model.TopicResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("photos/?client_id=${ACCESS_KEY}&page=10")
    fun getPhotos():Call<PhotosResponse>

    @GET("search/photos?client_id=${ACCESS_KEY}&page=3")
    fun getSearchedPhotos(@Query("query")query: String):Call<SearchResponse>

    @GET("topics?client_id=${ACCESS_KEY}")
    fun getTopicPhotos():Call<TopicResponse>

}