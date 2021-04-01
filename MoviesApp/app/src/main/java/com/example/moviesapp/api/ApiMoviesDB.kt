package com.example.moviesapp.api

import com.example.moviesapp.model.Movie
import com.example.moviesapp.model.MoviesResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiMoviesDB {

    companion object{
        const val API_KEY = "?api_key=6014c47f4de9e039fe2ddbdc70084887"
        const val TRENDING_PATH = "trending/movie/week$API_KEY"
        const val MOVIE_DETAILS_PATH = "movie/"
    }

    @GET(TRENDING_PATH)
    fun getWeekTrendingMovies(): Call<MoviesResult>

    @GET("$MOVIE_DETAILS_PATH{id}$API_KEY")
    fun getMovieDetails(@Path("id") id: Int): Call<Movie>


}