package com.example.moviesapp

import com.example.moviesapp.api.MovieRestApiTask
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
    fun testSuccesfullApiRequest(){
        val request = mockApiRequest()
        val successfullRequest = request.isSuccessful

        assertEquals(true, successfullRequest)

    }

    private fun mockApiRequest(): Response<MoviesResult> {
        val movieRestApiTask = MovieRestApiTask()
        val movieRepository = MoviesRepository(movieRestApiTask)
        val request = movieRestApiTask.retrofitApi().getWeekTrendingMovies().execute()
        return request
    }
}