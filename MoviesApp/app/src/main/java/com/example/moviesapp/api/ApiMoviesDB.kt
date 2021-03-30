package com.example.moviesapp.api

import com.example.moviesapp.model.Movie
import com.example.moviesapp.model.MoviesResult
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.GET

interface ApiMoviesDB {

    companion object{
        const val TRENDING_PATH = "trending/movie/week?api_key=6014c47f4de9e039fe2ddbdc70084887"
    }

    @GET(TRENDING_PATH)
    fun getWeekTrendingMovies(): Call<MoviesResult>
}