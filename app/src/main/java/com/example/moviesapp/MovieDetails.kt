package com.example.moviesapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.moviesapp.model.Movies

class MovieDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val movie = intent.getParcelableExtra<Movies>(MainActivity.INTENT_PARCELABLE)

        //val imgSrc = findViewById<ImageView>(R.id.title_details)
        val imgTitle = findViewById<TextView>(R.id.title_details)
        //val imgDesc = findViewById<TextView>(R.id._imageDesc)

        //imgSrc.setImageResource(image.imageSrc)
        //imgTitle.text = image.imageTitle
        //imgDesc.text = image.imageDesc
    }

}