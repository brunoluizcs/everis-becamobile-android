package com.nttdata.test.everis_becamobile_android.client

import com.nttdata.test.everis_becamobile_android.model.GenresJson
import com.nttdata.test.everis_becamobile_android.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Query

//exemplo: https://api.themoviedb.org/3/genre/movie/list?api_key=a822459f243b669b1a5d829c771e50e7&language=en-US

interface IGenreClient {
    @GET("genre/movie/list?api_key=${Constants.apiKey}&language=en-US")
    suspend fun getGenresDefault():GenresJson

    @GET("genre/movie/list?api_key=${Constants.apiKey}")
    suspend fun getGenresLanguage(
        @Query("language") language:String
    ):GenresJson
}