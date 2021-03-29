package com.example.everis_becamobile_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var trendingMovies: RecyclerView
    private lateinit var trendingMoviesAdapter: MoviesAdapter
    private lateinit var trendingMoviesLayoutMgr: LinearLayoutManager

    private var trendingMoviesPage = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        trendingMovies = findViewById(R.id.trending_movies)
        trendingMoviesLayoutMgr = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        trendingMovies.layoutManager = trendingMoviesLayoutMgr
        trendingMoviesAdapter = MoviesAdapter(mutableListOf())
        trendingMovies.adapter = trendingMoviesAdapter

        getTrendingMovies()

        MoviesRetrofit.getTrendingMovies(
            trendingMoviesPage,
            ::onTrendingMoviesFetched,
            ::onError
        )
    }

    private fun onError() {
        Toast.makeText(this, getString(R.string.error_fetch_movies), Toast.LENGTH_SHORT).show()
    }
}