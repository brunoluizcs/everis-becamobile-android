package com.nttdata.test.everis_becamobile_android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.bumptech.glide.Glide
import com.nttdata.test.everis_becamobile_android.client.IDetailsFilmsClient
import com.nttdata.test.everis_becamobile_android.databinding.ActivityDetailsBinding
import com.nttdata.test.everis_becamobile_android.model.details_films.DetailsFilmsOb
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DetailsActivity : AppCompatActivity() {
    private val binding by lazy { ActivityDetailsBinding.inflate(layoutInflater) }
    private var filmId: Int = 0

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private val detailsFilmsClient: IDetailsFilmsClient by lazy {
        retrofit.create(IDetailsFilmsClient::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        filmId = intent.getIntExtra("filmId",0)

        getData()
    }

    private fun getData() {
        lifecycleScope.launch {
            var details: DetailsFilmsOb? = null
            withContext(Dispatchers.IO){
                var result = detailsFilmsClient.getDetailsFilms(filmId,"pt-BR")
                if (result.id == null){
                    result = detailsFilmsClient.getDetailsDefault(filmId)
                }
                details = result
            }
            details?.let { setupUi(it) }
        }
    }

    private fun setupUi(details: DetailsFilmsOb) {
        Glide.with(applicationContext)
            .load("https://image.tmdb.org/t/p/original${details.backdrop_path}")
            .into(binding.ivDetailsBanner)

        binding.tvDetailsTitle.text = details.title
        binding.tvDetailsGenre.text = "Generos"
        binding.tvDetailsOverview.text = details.overview
    }
}