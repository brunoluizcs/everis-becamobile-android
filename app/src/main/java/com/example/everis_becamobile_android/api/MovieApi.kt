package com.example.everis_becamobile_android.api

import com.example.everis_becamobile_android.model.MoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("movie/trending")
    fun getTrendingMovies(
        @Query("api_key") apiKey: String = "53d41fbff7e912a32fa93c91175866a8",
        @Query("page") page: Int
    ): Call<MoviesResponse>
}