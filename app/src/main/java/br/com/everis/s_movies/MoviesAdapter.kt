package br.com.everis.s_movies

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop

class MoviesAdapter(
    private var movies: MutableList<Movie>,
    function: (Nothing) -> Unit
) : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    fun appendMovies(movies: List<Movie>) {
        this.movies.addAll(movies)
        notifyItemRangeInserted(
            this.movies.size,
            movies.size - 1)
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val poster: ImageView = itemView.findViewById(R.id.item_movie_poster)

        fun bind(movie: Movie) {
            Glide.with(itemView)
                .load("https://image.tmdb.org/t/p/w342${movie.posterPath}")
                .transform(CenterCrop())
                .into(poster)
            itemView.setOnClickListener {
                Log.d("teste-movie", movie.title)

                val intent = Intent(itemView.context, MovieDetailsActivity::class.java)
                intent.putExtra(MOVIE_BACKDROP, movie.backdropPath)
                intent.putExtra(MOVIE_POSTER, movie.posterPath)
                intent.putExtra(MOVIE_TITLE, movie.title)
                intent.putExtra(MOVIE_RATING, movie.rating)
                intent.putExtra(MOVIE_RELEASE_DATE, movie.releaseDate)
                intent.putExtra(MOVIE_OVERVIEW, movie.overview)

                itemView.context.startActivity(intent)

            }

        }


    }

}














