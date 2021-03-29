package com.example.everis_becamobile_android.api

import android.util.Log
import com.example.everis_becamobile_android.model.Movie
import com.example.everis_becamobile_android.model.MoviesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
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

    fun getTrendingMovies(page: Int = 1) {
        api.getTrendingMovies(page = page)
            .enqueue(object : Callback<MoviesResponse> {
                override fun onResponse(
                    call: Call<MoviesResponse>,
                    response: Response<MoviesResponse>
                ) {
                   if (response.isSuccessful) {
                       val responseBody = response.body()

                       if (responseBody != null) {
                           Log.d("Repository", "Movies: ${responseBody.movies_results}")
                       } else {
                           Log.d("Repository", "Failed to get response")
                       }
                   }
                }

                override fun onFailure(call: Call<MoviesResponse>, t: Throwable) {
                    Log.e("Repository", "onFailure", t)
                }
            })
    }
}