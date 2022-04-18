package com.example.picsar.picsar.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PhotosItem(
    val id: String?,
    val upDatedTime: String?,
    var imageDescription: String?,
    var imageLinks: ImageLinks?,
    var photographerDetails: PhotographerDetails?,

    ) : Parcelable

@Parcelize
data class ImageLinks(
    var full: String?,
    var regular: String?,
    val small: String?,
    val raw: String?,
) : Parcelable

@Parcelize
data class PhotographerDetails(
    val photographerName: String?,
    val profileImage: ProfileImage?,
) : Parcelable

@Parcelize
data class ProfileImage(
    val large: String?,
    val medium: String?,
    val small: String?,
) : Parcelable