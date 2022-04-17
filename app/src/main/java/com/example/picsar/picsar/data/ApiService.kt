package com.example.picsar.picsar.data

import com.example.picsar.picsar.ACCESS_KEY
import com.example.picsar.picsar.data.model.PhotosDtoItem
import com.example.picsar.picsar.data.model.SearchDto
import com.example.picsar.picsar.data.model.TopicDtoItem
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("photos/?client_id=${ACCESS_KEY}&page=10")
    suspend fun getPhotos(): List<PhotosDtoItem>

    @GET("search/photos?client_id=${ACCESS_KEY}&page=3")
    suspend fun getSearchedPhotos(@Query("query") query: String): SearchDto

    @GET("topics?client_id=${ACCESS_KEY}")
    suspend fun getTopicPhotos(): List<TopicDtoItem>

}