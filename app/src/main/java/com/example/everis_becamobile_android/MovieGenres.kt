package com.example.everis_becamobile_android

import com.google.gson.annotations.SerializedName

data class MovieGenres (
    @SerializedName("id") val genreId: Int,
    @SerializedName("name") val genreName: String
    )