package com.example.picsar.picsar.domain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TopicItem(
    val coverPhotoImage: CoverPhotoImage?,
) : Parcelable

@Parcelize
data class TopicUrlsLinks(
    val full: String?,
    val raw: String?,
    val regular: String?,
    val small: String?,
    val thumb: String?,
):Parcelable

@Parcelize
data class CoverPhotoImage(
    val topicUrlsLinks: ImageLinks?,
):Parcelable