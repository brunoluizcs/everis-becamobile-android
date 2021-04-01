package com.example.moviesapp.view

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.moviesapp.R
import com.example.moviesapp.model.Movie
import com.example.moviesapp.repository.MoviesAdapter
import com.example.moviesapp.viewmodel.MovieDetailsViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_details.*
import kotlinx.android.synthetic.main.movie_details.progressBar
import java.lang.Exception

class MovieDetailActivity : AppCompatActivity(){

    private lateinit var movieDetailsViewModel: MovieDetailsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_details)
        movieDetailsViewModel = ViewModelProvider.NewInstanceFactory().create(MovieDetailsViewModel::class.java)
        movieDetailsViewModel.init(intent.getIntExtra("id", -1), applicationContext)

        initToolbar()
        initObserver()
        loadingVisibility(true)
    }

    private fun initObserver(){
        movieDetailsViewModel.movieDetails.observe(this, Observer {
            setupMovie(it)
        })
    }

    private fun setupMovie(movie: Movie){
        movieDetailsPoster.apply {
            loadImage(movieDetailsPoster, movie)
        }
        movieDetailsRate.text = movie.voteAverage.toString()
        movieDetailsTitle.text = movie.title
        movieDetailsOverview.text = movie.overview
        starRate.visibility = View.VISIBLE
    }

    private fun loadImage(imageView: AppCompatImageView, movie: Movie){
        Picasso.get().load("${MoviesAdapter.IMG_BASE_URL}${movie.posterPath}").placeholder(R.drawable.ic_image_placeholder).into(imageView, object: com.squareup.picasso.Callback {
            override fun onSuccess() {
                loadingVisibility(false)
            }

            override fun onError(e: Exception?) {
                loadingVisibility(false)
                Log.i("MovieDetailActivity", e.toString())
                Toast.makeText(applicationContext, "Unable to load image", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun loadingVisibility(isLoading: Boolean){
        progressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
    }

    private fun initToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }



    override fun onSupportNavigateUp(): Boolean{
        finish()
        return true
    }

}