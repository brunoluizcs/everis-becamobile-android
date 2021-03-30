package com.example.moviesapp.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.moviesapp.api.MovieRestApiTask
import com.example.moviesapp.model.Movie
import com.example.moviesapp.model.MoviesResult

class MoviesRepository(private val movieRestApiTask: MovieRestApiTask){

    fun getTrendingMovies(): List<Movie> {
        val request = movieRestApiTask.retrofitApi().getWeekTrendingMovies().execute()
        return request.body()?.results!!
    }

    fun getMovieDetails(movieId: Int): Movie? {
        val request = movieRestApiTask.retrofitApi().getMovieDetails(movieId).execute()
        return request.body()
    }

}
