package com.example.everis_becamobile_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.everis_becamobile_android.api.MoviesRetrofit
import com.example.everis_becamobile_android.model.Movie
import com.example.everis_becamobile_android.viewmodel.MoviesAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var trendingMovies: RecyclerView
    private lateinit var trendingMoviesAdapter: MoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trendingMovies = findViewById(R.id.trending_movies)
        trendingMovies.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        trendingMoviesAdapter = MoviesAdapter(listOf())
        trendingMovies.adapter = trendingMoviesAdapter

        MoviesRetrofit.getTrendingMovies(
            onSuccess = ::onTrendingMoviesFetched,
            onError = ::onError
        )
    }

    private fun onTrendingMoviesFetched(movies: List<Movie>) {
        trendingMoviesAdapter.updateMovies(movies)
    }

    private fun onError() {
        Toast.makeText(this, getString(R.string.error_fetch_movies), Toast.LENGTH_SHORT).show()
    }
}