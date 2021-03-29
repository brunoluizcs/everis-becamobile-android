package com.example.moviesapp.model

data class Movie (
    val id: Int,
    val adult: Boolean,
    val title: String,
    val originalTitle: String,
    val voteCount: Int,
    val voteAverage: Double,
    val popularity: Double,
    val overview: String,
    val releaseDate: String,
    val backdropPath: String,
    val posterPath: String
)