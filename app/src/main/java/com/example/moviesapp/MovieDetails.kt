package com.example.moviesapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.moviesapp.model.Movies

class MovieDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
        val movie = intent.getParcelableExtra<Movies>(MainActivity.INTENT_PARCELABLE)
        val movieImage = findViewById<ImageView>(R.id.poster_details)
        val movieTitle = findViewById<TextView>(R.id.title_details)
        val movieDate = findViewById<TextView>(R.id.genero_details)
        val movieOverview = findViewById<TextView>(R.id.overview_details)
        if (movie != null) {
            movieOverview.text = movie.overview
            movieTitle.text = movie.title
            movieDate.text = "Sinopse"
            Glide.with(movieImage).load(IMAGE_BASE + movie.poster).into(movieImage)
        }
    }
}
