package com.example.everis_becamobile_android

import android.content.Intent
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
        trendingMoviesAdapter = MoviesAdapter(mutableListOf()) { movie -> showMovieDetails(movie) }
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

    private fun showMovieDetails(movie: Movie) {
        val intent = Intent(this, MovieDetails::class.java)
        intent.putExtra(MOVIE_GENRE, movie.genreIds[1])
        intent.putExtra(MOVIE_BACKDROP, movie.backdrop_path)
        intent.putExtra(MOVIE_POSTER, movie.poster_path)
        intent.putExtra(MOVIE_TITLE, movie.title)
        intent.putExtra(MOVIE_RATING, movie.rating)
        intent.putExtra(MOVIE_RELEASE_DATE, movie.release_date)
        intent.putExtra(MOVIE_OVERVIEW, movie.overview)
        startActivity(intent)
    }
}