package com.example.everis_becamobile_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.everis_becamobile_android.api.MoviesRetrofit
import com.example.everis_becamobile_android.model.Movie

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MoviesRetrofit.getTrendingMovies(
            onSuccess = ::onTrendingMoviesFetched,
            onError = ::onError
        )
    }

    private fun onTrendingMoviesFetched(movies: List<Movie>) {
        Log.d("MainActivity", "Movies: $movies")
    }

    private fun onError() {
        Toast.makeText(this, getString(R.string.error_fetch_movies), Toast.LENGTH_SHORT).show()
    }
}