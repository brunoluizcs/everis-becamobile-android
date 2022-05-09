package com.nttdata.test.everis_becamobile_android.client

import com.nttdata.test.everis_becamobile_android.model.trending_films.JsonFilms
import com.nttdata.test.everis_becamobile_android.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Path

interface IFilmsClient {
//    @GET("trending/{media_type}/{time_window}")
//    @Headers("api_key: a822459f243b669b1a5d829c771e50e7")
    @GET("trending/{media_type}/{time_window}?api_key=${Constants.apiKey}")
    suspend fun getTreadingFilmsPath(
        @Path("media_type") media_type: String,
        @Path("time_window") time_window: String
    ): JsonFilms

    @GET("trending/all/week?api_key=a822459f243b669b1a5d829c771e50e7")
    suspend fun getTreadingAllWeek(): JsonFilms
}