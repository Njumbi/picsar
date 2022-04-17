package com.example.picsar.picsar.data.repository

import com.example.picsar.picsar.data.ApiResource
import com.example.picsar.picsar.data.ApiService
import com.example.picsar.picsar.data.mappers.dtoToDomain.toDomain
import com.example.picsar.picsar.data.safeApiCall
import com.example.picsar.picsar.domain.PhotosItem
import javax.inject.Inject

interface GetPhotosRepo {
    suspend fun getPhotos(): ApiResource<List<PhotosItem>>
}
class GetPhotosRepoImpl @Inject constructor(val apiService: ApiService) : GetPhotosRepo {

    override suspend fun getPhotos() = safeApiCall {
        apiService.getPhotos().map { it.toDomain() }
    }

}