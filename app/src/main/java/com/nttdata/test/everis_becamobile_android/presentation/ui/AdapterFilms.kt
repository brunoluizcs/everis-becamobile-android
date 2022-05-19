package com.nttdata.test.everis_becamobile_android.presentation.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nttdata.test.everis_becamobile_android.databinding.ItemListFilmsBinding
import com.nttdata.test.everis_becamobile_android.domain.model.AdapterHelperClass

class AdapterFilms : ListAdapter<AdapterHelperClass, AdapterFilms.ViewHolder>(DIFF_CALLBACK) {
    var onClickListener: ((filmId: Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemListFilmsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, onClickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder(
        private val binding: ItemListFilmsBinding,
        private val onClickListener: ((filmId: Int) -> Unit)? = null
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(helper: AdapterHelperClass) {
            binding.ratingBar.rating = helper.film?.vote_average?.toFloat()!! / 2
            binding.tvItemRating.text = helper.film?.vote_average.toString()
            if (!helper.film?.title.isNullOrEmpty()) {
                binding.tvItemTitle.text = helper.film?.title
                binding.tvItemTitle.contentDescription = helper.film?.title
            }
            if (helper.film?.name != null && helper.film?.title.isNullOrEmpty()) {
                try {
                    binding.tvItemTitle.text = helper.film?.name
                    binding.tvItemTitle.contentDescription = helper.film?.name
                } catch (e: Exception) {
                    e.printStackTrace()
                    binding.tvItemTitle.text = "no title"
                }
            }

            var str = ""
            helper.listGenre?.forEach { filmGenreId ->
                if (helper.film!!.genre_ids.contains(filmGenreId.id)) {
                    str += filmGenreId.name + ", "
                }
            }
            binding.tvItemGenere.text = str.dropLast(2)

            binding.tvItemDescription.text = helper.film!!.overview

            Glide.with(binding.root.context)
                .load("https://image.tmdb.org/t/p/original${helper.film!!.poster_path}")
                .centerCrop()
                .into(binding.imageView)

            binding.cvItem.setOnClickListener {
                onClickListener?.invoke(helper.film!!.id)
            }
        }
    }

//    class ViewHolder(
//        private val binding: ItemListFilmsBinding,
//        private val onClickListener: ((filmId: Int) -> Unit)? = null
//    ) : RecyclerView.ViewHolder(binding.root) {
//        fun bind(helper: AdapterHelperClass) {
//            binding.ratingBar.rating = film.vote_average.toFloat() / 2
//            binding.tvItemRating.text = film.vote_average.toString()
//            if (!film.title.isNullOrEmpty()){
//                binding.tvItemTitle.text = film.title
//            }
//            if(film.name != null && film.title.isNullOrEmpty()){
//                try {
//                    binding.tvItemTitle.text = film.name
//                }catch (e:Exception){
//                    e.printStackTrace()
//                    binding.tvItemTitle.text = "no title"
//                }
//            }
//
//            GlobalScope.launch {
//                var listGenre:List<Genre> = emptyList()
//                withContext(Dispatchers.IO){
//                    val retrofit = Retrofit.Builder()
//                        .baseUrl("https://api.themoviedb.org/3/")
//                        .addConverterFactory(GsonConverterFactory.create())
//                        .build()
//                    val result = retrofit.create(IGenreClient::class.java)
//
//                    listGenre = result.getGenresDefault().genres
//                }
//                var str:String = ""
//                listGenre.forEach { filmGenreId ->
//                    if (film.genre_ids.contains(filmGenreId.id)){
//                        str += filmGenreId.name+" ,"
//                        binding.tvItemGenere.text = str
//
//                    }
//                }
//
//
//
//            binding.tvItemDescription.text = film.overview
//
//            Glide.with(binding.root.context)
//                .load("https://image.tmdb.org/t/p/original${film.poster_path}")
//                .centerCrop()
//                .into(binding.imageView)
//
//            binding.cvItem.setOnClickListener {
//                onClickListener?.invoke(film.id)
//            }
//
//
//        }
//    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<AdapterHelperClass>() {
            override fun areItemsTheSame(
                oldItem: AdapterHelperClass,
                newItem: AdapterHelperClass
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: AdapterHelperClass,
                newItem: AdapterHelperClass
            ): Boolean {
                return oldItem == newItem
            }
        }
    }

//    companion object {
//        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Result>() {
//            override fun areItemsTheSame(oldItem: Result, newItem: Result): Boolean {
//                return oldItem.id == newItem.id
//            }
//
//            override fun areContentsTheSame(oldItem: Result, newItem: Result): Boolean {
//                return oldItem == newItem
//            }
//
//        }
//    }
}
