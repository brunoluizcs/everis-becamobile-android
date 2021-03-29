package com.example.moviesapp.model

import com.google.gson.annotations.SerializedName

data class MoviesResult (
    @SerializedName("results")
    val results: List<Movie>
)