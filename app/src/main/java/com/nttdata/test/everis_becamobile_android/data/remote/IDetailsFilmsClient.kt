package com.nttdata.test.everis_becamobile_android.data.remote

import com.nttdata.test.everis_becamobile_android.domain.model.details_films.DetailsFilmsOb
import com.nttdata.test.everis_becamobile_android.domain.utils.Constants
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface IDetailsFilmsClient {
    @GET("https://api.themoviedb.org/3/movie/{movie_id}?api_key=${Constants.apiKey}")
    suspend fun getDetailsFilms(
        @Path("movie_id") movieId: Int,
        @Query("language") language:String
    ): DetailsFilmsOb

    @GET("https://api.themoviedb.org/3/movie/{movie_id}?api_key=${Constants.apiKey}")
    suspend fun getDetailsDefault(
        @Path("movie_id") movieId: Int,
    ): DetailsFilmsOb

}