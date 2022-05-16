package com.example.moviesapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.moviesapp.model.Movies
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter(
    private val context: Context,
    private val movies: List<Movies>,
    private val listener: (Movies) -> Unit
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"
        fun bindMovie(movie: Movies, listener: (Movies) -> Unit) {
            itemView.movie_title.text = movie.title
            itemView.movie_vote.text = "Avaliação: " + movie.vote
            // itemView.movie_release_date.text = movie.release
            itemView.movie_release_date.text = movie.release
            Glide.with(itemView).load(IMAGE_BASE + movie.poster).into(itemView.movie_poster)

            /*itemView.setOnClickListener {
                Log.i("click","Id:"+movie.id+"Title:"+movie.title)
            }*/
            itemView.setOnClickListener { listener(movie) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
        )
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindMovie(movies.get(position), listener)
    }
}
