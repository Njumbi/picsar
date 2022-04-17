package com.example.picsar.picsar.data.model


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class SearchDto(
    @SerializedName("results")
    var results: List<PhotosDtoItem?>?,
    @SerializedName("total")
    var total: Int?, // 10014
    @SerializedName("total_pages")
    var totalPages: Int? // 1002
)
