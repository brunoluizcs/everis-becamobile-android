package com.example.moviesapp.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieRestApiTask {

    companion object{
        const val BASE_URL = "https://api.themoviedb.org/3/"
    }

    private fun movieProvider(): Retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()

    fun retrofitApi(): ApiMoviesDB = movieProvider().create(ApiMoviesDB::class.java)
}