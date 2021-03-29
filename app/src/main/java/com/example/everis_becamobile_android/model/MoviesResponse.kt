package com.example.everis_becamobile_android.model

import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val movies_results: List<Movie>,
    @SerializedName("total_pages") val pages: Int
)
