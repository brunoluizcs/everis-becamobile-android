package com.example.moviesapp.repository

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.example.moviesapp.R
import com.example.moviesapp.model.Movie
import kotlinx.android.synthetic.main.movie_item_layout.view.*

class MoviesAdapter(private val moviesList: List<Movie>): RecyclerView.Adapter<MoviesViewHolder>() {

    companion object{
        const val IMG_BASE_URL = "https://image.tmdb.org/t/p/w500/"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item_layout, parent, false)
        return MoviesViewHolder(view)
    }

    override fun getItemCount(): Int = moviesList.size

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.itemView.apply {
            movieTitle.text = moviesList[position].title
            Picasso.get().load("$IMG_BASE_URL${moviesList[position].backdropPath}").placeholder(R.drawable.ic_image_placeholder).into(movieImage)
        }
    }
}