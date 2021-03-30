package com.example.moviesapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviesapp.api.MovieRestApiTask
import com.example.moviesapp.model.Movie
import com.example.moviesapp.repository.MoviesRepository
import java.lang.Exception

class MovieListViewModel: ViewModel() {

    private val movieRestApiTask = MovieRestApiTask()
    private val moviesRepository = MoviesRepository(movieRestApiTask)

    private var _moviesList = MutableLiveData<List<Movie>>()
    val moviesList: LiveData<List<Movie>>
        get() = _moviesList

    fun init(){
        getTrendingMovies()
    }

    private fun getTrendingMovies(){
        Thread{
            try{
                _moviesList.postValue(moviesRepository.getTrendingMovies())
            }catch (exception: Exception){
                Log.d("MovieListViewModel", exception.message.toString())
            }
        }.start()
    }
}