package com.example.everis_becamobile_android.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("trending/movie/week")
    fun getTrendingMovies(
        @Query("api_key") apiKey: String = "53d41fbff7e912a32fa93c91175866a8",
        @Query("page") page: Int
    ): Call<MoviesResponse>

    //https://api.themoviedb.org/3/search/movie?api_key=53d41fbff7e912a32fa93c91175866a8&language=en-US&page=1&include_adult=false&&query=Avengers
}