package com.example.moviesapp

import com.example.moviesapp.api.MovieRestApiTask
import com.example.moviesapp.model.Movie
import com.example.moviesapp.model.MoviesResult
import com.example.moviesapp.repository.MoviesRepository
import org.junit.Test

import org.junit.Assert.*
import retrofit2.Response

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class RepositoryUnitTest {
    @Test
    fun testSuccesfullApiTrendingRequest(){
        val request = mockApiTrendingRequest()
        val successfullRequest = request.isSuccessful

        println(request.message())

        assertEquals(true, successfullRequest)
    }

    @Test
    fun testSuccesfullApiDetailsRequest(){
        val requestResults = mockApiTrendingRequest()
        val movieId = requestResults.body()?.results?.get(0)?.id
        val requestMovie = movieId?.let { mockApiMovieDetailsRequest(it) }
        val successfullRequest = requestMovie?.isSuccessful

        assertEquals(true, successfullRequest)
    }


    private fun mockApiMovieDetailsRequest(id: Int): Response<Movie>{
        val movieRestApiTask = MovieRestApiTask()
        val request = movieRestApiTask.retrofitApi().getMovieDetails(id).execute()
        return request
    }

    private fun mockApiTrendingRequest(): Response<MoviesResult> {
        val movieRestApiTask = MovieRestApiTask()
        val request = movieRestApiTask.retrofitApi().getWeekTrendingMovies().execute()
        return request
    }
}