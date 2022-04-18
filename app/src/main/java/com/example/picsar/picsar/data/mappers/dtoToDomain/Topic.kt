package com.example.picsar.picsar.data.mappers.dtoToDomain

import com.example.picsar.picsar.data.model.CoverPhoto
import com.example.picsar.picsar.data.model.TopicDtoItem
import com.example.picsar.picsar.domain.CoverPhotoImage
import com.example.picsar.picsar.domain.TopicItem

fun TopicDtoItem.toDomain() = TopicItem(
    coverPhotoImage = coverPhoto?.toDomain()
)

fun CoverPhoto.toDomain() = CoverPhotoImage(
    topicUrlsLinks = urls?.toDomain()
)