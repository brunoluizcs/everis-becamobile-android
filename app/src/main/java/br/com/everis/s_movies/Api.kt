package br.com.everis.s_movies

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "165421381378b47a669617653ebdac45",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

}