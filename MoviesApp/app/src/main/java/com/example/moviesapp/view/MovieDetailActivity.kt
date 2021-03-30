package com.example.moviesapp.view

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.moviesapp.R
import com.example.moviesapp.model.Movie
import com.example.moviesapp.repository.MoviesAdapter
import com.example.moviesapp.viewmodel.MovieDetailsViewModel
import com.example.moviesapp.viewmodel.MovieListViewModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.movie_details.*
import kotlinx.android.synthetic.main.movie_item_layout.view.*

class MovieDetailActivity : AppCompatActivity(){

    private lateinit var movieDetailsViewModel: MovieDetailsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.movie_details)
        movieDetailsViewModel = ViewModelProvider.NewInstanceFactory().create(MovieDetailsViewModel::class.java)
        movieDetailsViewModel.init(intent.getIntExtra("id", -1))

        initObserver()
    }

    private fun initObserver(){
        movieDetailsViewModel.movieDetails.observe(this, Observer {
           setupMovie(it)
        })
    }

    private fun setupMovie(movie: Movie){
        moviePoster.apply {
            Picasso.get().load("${MoviesAdapter.IMG_BASE_URL}${movie.posterPath}").placeholder(R.drawable.ic_image_placeholder).into(moviePoster)
        }
    }

}