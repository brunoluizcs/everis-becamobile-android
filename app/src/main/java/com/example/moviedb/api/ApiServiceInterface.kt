package com.example.moviedb.api

import com.example.moviedb.models.Data
import com.example.moviedb.models.Movie
import com.example.moviedb.models.ResultCasts
import com.example.moviedb.util.Constants
import io.reactivex.Observable
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServiceInterface {

    @GET("discover/movie?api_key=7aeb3719314193444e0bf20ce17b90a0")
    fun getMovieList(): Observable<Data>

    @GET("search/movie?api_key=7aeb3719314193444e0bf20ce17b90a0")
    fun getMovieListSearch(@Path("query") query: String): Observable<Data>

    @GET("movie/{movie_id}/credits?api_key=7aeb3719314193444e0bf20ce17b90a0")
    fun getCredits(@Path("movie_id") movieId: Int): Observable<ResultCasts>

    @GET("movie/{movie_id}?api_key=7aeb3719314193444e0bf20ce17b90a0")
    fun getMovie(@Path("movie_id") movieId: Int): Observable<Movie>

    companion object Factory {
        fun create(): ApiServiceInterface {
            val retrofit = retrofit2.Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(Constants.BASE_URL)
                    .build()

            return retrofit.create(ApiServiceInterface::class.java)
        }
    }
}