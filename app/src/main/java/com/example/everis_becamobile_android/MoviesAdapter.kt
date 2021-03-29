package com.example.everis_becamobile_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop

class MoviesAdapter (
    private var movies: MutableList<Movie>,
    private val onMovieClick: (movie: Movie) -> Unit
) : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    fun updateMovies(movies: List<Movie>) {
        this.movies.addAll(movies)
        notifyItemRangeInserted(
            this.movies.size,
            movies.size - 1
        )
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val image: ImageView = itemView.findViewById(R.id.item_movie_image)
        //private val title: TextView = itemView.findViewById(R.id.item_movie_title)
        // private val releaseDate: TextView = itemView.findViewById(R.id.item_movie_release_date)
        // private val genre: TextView = itemView.findViewById(R.id.item_movie_genre)

        fun bind(movie: Movie) {
        //title.text = movie.title
        //releaseDate.text = movie.release_date
        // genre.text = movie.genreIds

            Glide.with(itemView)
                .load("https://image.tmdb.org/t/p/w342${movie.poster_path}")
                .transform(CenterCrop())
                .into(image)
            itemView.setOnClickListener { onMovieClick.invoke(movie) }
        }
    }
}