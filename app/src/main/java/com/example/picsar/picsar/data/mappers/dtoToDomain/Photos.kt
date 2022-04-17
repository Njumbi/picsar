package com.example.picsar.picsar.data.mappers.dtoToDomain

import com.example.picsar.picsar.data.model.*
import com.example.picsar.picsar.domain.ImageLinks
import com.example.picsar.picsar.domain.PhotographerDetails
import com.example.picsar.picsar.domain.PhotosItem
import com.example.picsar.picsar.domain.ProfileImage

fun PhotosDtoItem.toDomain() = PhotosItem(
    id = id,
    upDatedTime = updatedAt,
    imageDescription = altDescription,
    imageLinks = urls?.toDomain(),
    photographerDetails = user?.toDomain(),
)

fun Urls.toDomain() = ImageLinks(
    full = full,
    regular = regular,
    small = small,
    raw = raw
)

fun User.toDomain() = PhotographerDetails(
    photographerName = name,
    profileImage = profileImage?.toDomain()
)

fun ProfileDtoImage.toDomain() = ProfileImage(
    large = large,
    medium = medium,
    small = small
)