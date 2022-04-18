package com.example.picsar.picsar.data.repository

import com.example.picsar.picsar.data.ApiResource
import com.example.picsar.picsar.data.ApiService
import com.example.picsar.picsar.data.mappers.dtoToDomain.toDomain
import com.example.picsar.picsar.data.safeApiCall
import com.example.picsar.picsar.domain.TopicItem
import javax.inject.Inject

interface GetTopicPhotosRepo {
    suspend fun getTopicPhotos(): ApiResource<List<TopicItem>>
}

class GetTopicPhotosRepoImpl @Inject constructor(val apiService: ApiService) : GetTopicPhotosRepo {

    override suspend fun getTopicPhotos() = safeApiCall {
        apiService.getTopicPhotos().map { it.toDomain() }
    }

}