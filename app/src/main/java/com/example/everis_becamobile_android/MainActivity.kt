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
            LinearLayoutManager.VERTICAL,
            false
        )
        trendingMovies.layoutManager = trendingMoviesLayoutMgr
        trendingMoviesAdapter = MoviesAdapter(mutableListOf())
        trendingMovies.adapter = trendingMoviesAdapter

        getTrendingMovies()
    }

    private fun getTrendingMovies() {
        MoviesRetrofit.getTrendingMovies(
            trendingMoviesPage,
            ::onTrendingMoviesFetched,
            ::onError
        )
    }

    private fun attachTrendingMoviesOnScrollListener() {
        trendingMovies.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val totalItemCount = trendingMoviesLayoutMgr.itemCount
                val visibleItemCount = trendingMoviesLayoutMgr.childCount
                val firstVisibleItem = trendingMoviesLayoutMgr.findFirstVisibleItemPosition()

                if (firstVisibleItem + visibleItemCount >= totalItemCount / 2) {
                    trendingMovies.removeOnScrollListener(this)
                    trendingMoviesPage++
                    getTrendingMovies()
                }
            }
        })
    }

    private fun onTrendingMoviesFetched(movies: List<Movie>) {
        trendingMoviesAdapter.updateMovies(movies)
        attachTrendingMoviesOnScrollListener()
    }

    private fun onError() {
        Toast.makeText(this, getString(R.string.error_fetch_movies), Toast.LENGTH_SHORT).show()
    }
}