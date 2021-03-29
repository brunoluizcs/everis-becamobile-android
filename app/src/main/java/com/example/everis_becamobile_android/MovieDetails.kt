package com.example.everis_becamobile_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

    const val MOVIE_BACKDROP = "extra_movie_backdrop"
    const val MOVIE_POSTER = "extra_movie_poster"
    const val MOVIE_TITLE = "extra_movie_title"
    const val MOVIE_RATING = "extra_movie_title"
    const val MOVIE_RELEASE_DATE = "extra_movie_release_date"
    const val MOVIE_OVERVIEW = "extra_movie_overview"

class MovieDetails : AppCompatActivity() {

    private lateinit var backdrop: ImageView
    private lateinit var image: ImageView
    private lateinit var title: TextView
    private lateinit var rating: RatingBar
    private lateinit var release_date: TextView
    private lateinit var overview: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        backdrop = findViewById(R.id.movie_backdrop)
        image = findViewById(R.id.movie_poster)
        title = findViewById(R.id.movie_title)
        rating = findViewById(R.id.movie_rating)
        release_date = findViewById(R.id.movie_release_date)
        overview = findViewById(R.id.movie_overview)
    }
}