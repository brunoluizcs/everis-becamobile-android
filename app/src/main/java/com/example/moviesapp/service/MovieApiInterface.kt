package com.example.moviesapp.service

import com.example.moviesapp.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    // @GET("/3/movie/popular?api_key=bbf5a3000e95f1dddf266b5e187d4b21")
    // @GET("/3/movie/popular?api_key=e88496ae8e745706ce59d628b2fdbb3f")
    @GET("/3/trending/movie/week?api_key=e88496ae8e745706ce59d628b2fdbb3f")
    fun getMovieList(): Call<MovieResponse>
}
