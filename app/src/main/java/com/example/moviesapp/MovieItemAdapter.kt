package com.example.moviesapp

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.databinding.MoviesListItemBinding
import com.example.moviesapp.model.Movie

class MovieItemAdapter:ListAdapter <Movie,MovieItemAdapter.MovieItemViewHolder> (DIFF_CALLBACK){

    var onClickListener: ((movieId:Int) -> Unit)? = null

    class MovieItemViewHolder(private val binding: MoviesListItemBinding,
    private val onClickListener: ((movieId:Int) -> Unit)?
    ) : RecyclerView.ViewHolder(binding.root){

        fun bind(movie:Movie){
            binding.descricao.text = movie.title
            binding.genero.text = movie.genre_ids
            binding.data.text = movie.release_date

            binding.root.setOnClickListener{
               onClickListener?.invoke(movie.id)
            }
        }
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Movie> (){
            override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
               return oldItem == newItem
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieItemViewHolder {
        val binding = MoviesListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MovieItemViewHolder(binding, onClickListener)
    }

    override fun onBindViewHolder(holder: MovieItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}