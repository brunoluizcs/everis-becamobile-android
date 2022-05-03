package com.nttdata.test.everis_becamobile_android.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nttdata.test.everis_becamobile_android.databinding.ItemListFilmsBinding
import com.nttdata.test.everis_becamobile_android.model.Result

class AdapterFilms: ListAdapter<Result,AdapterFilms.ViewHolder>(DIFF_CALLBACK) {
    var onClickListener:((filmId:Int)->Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListFilmsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding,onClickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder(
        private val binding: ItemListFilmsBinding,
        private val onClickListener: ((filmId:Int)->Unit)? = null
    ):RecyclerView.ViewHolder(binding.root){
        fun bind(film:Result){
            binding.ratingBar.rating = film.vote_average.toFloat()/2
            binding.tvItemRating.text = film.vote_average.toString()
            binding.tvItemTitle.text = film.title
            if (film.adult){
                binding.tvItemGenere.text = "Adulto"
            }else{
                binding.tvItemGenere.text = "Livre"
            }
            binding.tvItemDescription.text = film.overview

            Glide.with(binding.root.context)
                .load("https://image.tmdb.org/t/p/original${film.poster_path}")
                .centerCrop()
                .into(binding.imageView)

            binding.cvItem.setOnClickListener {
                onClickListener?.invoke(film.id)
            }


        }
    }

    companion object{
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Result>(){
            override fun areItemsTheSame(oldItem: Result, newItem: Result): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Result, newItem: Result): Boolean {
                return oldItem == newItem
            }

        }
    }
}