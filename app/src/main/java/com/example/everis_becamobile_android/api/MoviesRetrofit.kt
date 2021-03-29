package com.example.everis_becamobile_android.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MoviesRetrofit {
    private val api: MovieApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/all/day?api_key=")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(MovieApi::class.java)
    }
}