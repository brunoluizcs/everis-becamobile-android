package com.example.moviesapp.viewmodel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviesapp.api.MovieRestApiTask
import com.example.moviesapp.model.Movie
import com.example.moviesapp.repository.MoviesRepository

class MovieDetailsViewModel: ViewModel() {

    private val movieRestApiTask = MovieRestApiTask()
    private val moviesRepository = MoviesRepository(movieRestApiTask)

    private var _movieDetails = MutableLiveData<Movie>()
    val movieDetails: LiveData<Movie>
        get() = _movieDetails

    fun init(movieId: Int, context: Context){
        getMovieDetails(movieId, context)
    }

    private fun getMovieDetails(movieId: Int, context: Context) {
        moviesRepository.getMovieDetails(movieId, context, ::onRequestSuccess, ::onRequestError)
    }

    private fun onRequestSuccess(movie: Movie){
        _movieDetails.postValue(movie)
    }

    private fun onRequestError(context: Context, code: Int?){
        if(code != null){
            Toast.makeText(context, "Error $code", Toast.LENGTH_SHORT)
        }else{
            Toast.makeText(context, "Unable to load movie details", Toast.LENGTH_SHORT)
        }
    }
}