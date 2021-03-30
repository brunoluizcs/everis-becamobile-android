package com.example.moviesapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviesapp.api.MovieRestApiTask
import com.example.moviesapp.model.Movie
import com.example.moviesapp.repository.MoviesRepository
import java.lang.Exception

class MovieDetailsViewModel: ViewModel() {

    private val movieRestApiTask = MovieRestApiTask()
    private val moviesRepository = MoviesRepository(movieRestApiTask)

    private var _movieDetails = MutableLiveData<Movie>()
    val movieDetails: LiveData<Movie>
        get() = _movieDetails

    fun init(movieId: Int){
        getMovieDetails(movieId)
    }

    private fun getMovieDetails(movieId: Int){
        Thread{
            try{
                _movieDetails.postValue(movieId.let{moviesRepository.getMovieDetails(it)})
            }catch (exception: Exception){
                Log.d("MovieDetailsViewModel", exception.message.toString())
            }
        }.start()
    }
}