package com.example.picsar.picsar.data.repository

import com.example.picsar.picsar.data.ApiResource
import com.example.picsar.picsar.data.ApiService
import com.example.picsar.picsar.data.mappers.dtoToDomain.toDomain
import com.example.picsar.picsar.data.safeApiCall
import com.example.picsar.picsar.domain.PhotosItem
import javax.inject.Inject

interface SearchPhotosRepo{
    suspend fun searchPhotos(query: String):ApiResource<List<PhotosItem>?>
}

class SearchPhotosRepoImpl @Inject constructor(val apiService: ApiService) : SearchPhotosRepo {

    override suspend fun searchPhotos(query: String) = safeApiCall {
        apiService.getSearchedPhotos(query).toDomain()!!
    }
}