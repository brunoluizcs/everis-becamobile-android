package com.example.moviesapp.api

import com.example.moviesapp.model.Movie
import retrofit2.http.GET

interface ApiMoviesDB {

    companion object{
        const val TRENDING_PATH = "3/trending/movies/week?api_key=6014c47f4de9e039fe2ddbdc70084887"
    }

    @GET(TRENDING_PATH)
    fun getWeekTrendingMovies(): List<Movie>
}