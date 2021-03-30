package com.example.everis_becamobile_android

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("trending/movie/week")
    fun getTrendingMovies(
        @Query("api_key") apiKey: String = "53d41fbff7e912a32fa93c91175866a8",
        @Query("page") page: Int
    ): Call<MoviesResponse>

}