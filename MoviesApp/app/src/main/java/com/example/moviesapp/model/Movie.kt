package com.example.moviesapp.model

import com.google.gson.annotations.SerializedName

data class Movie (
    val id: Int,
    val adult: Boolean,
    val title: String,
    @SerializedName("original_title")
    val originalTitle: String,
    @SerializedName("vote_count")
    val voteCount: Int,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("popularity")
    val popularity: Double,
    val overview: String,
    @SerializedName("release_date")
    val releaseDate: String,
    @SerializedName("backdrop_path")
    val backdropPath: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("media_type")
    val mediaType: String
)