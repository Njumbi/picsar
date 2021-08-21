package com.example.picsar.ui.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class SearchResponse(
    @SerializedName("results")
    var results: List<PhotosResponseItem?>?,
    @SerializedName("total")
    var total: Int?, // 10014
    @SerializedName("total_pages")
    var totalPages: Int? // 1002
)
{}
