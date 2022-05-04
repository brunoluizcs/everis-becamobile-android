package com.nttdata.test.everis_becamobile_android.client

import com.nttdata.test.everis_becamobile_android.model.details_films.DetailsFilmsOb
import com.nttdata.test.everis_becamobile_android.utils.Util
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface IDetailsFilmsClient {
    @GET("https://api.themoviedb.org/3/movie/{movie_id}?api_key=${Util.apiKey}")
    suspend fun getDetailsFilms(
        @Path("movie_id") movieId: Int,
        @Query("language") language:String
    ): DetailsFilmsOb

    @GET("https://api.themoviedb.org/3/movie/{movie_id}?api_key=${Util.apiKey}")
    suspend fun getDetailsDefault(
        @Path("movie_id") movieId: Int,
    ): DetailsFilmsOb

}