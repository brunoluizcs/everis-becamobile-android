package com.nttdata.test.everis_becamobile_android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.bumptech.glide.Glide
import com.nttdata.test.everis_becamobile_android.client.IDetailsFilmsClient
import com.nttdata.test.everis_becamobile_android.databinding.ActivityDetailsBinding
import com.nttdata.test.everis_becamobile_android.model.FilmsApiResult
import com.nttdata.test.everis_becamobile_android.model.details_films.DetailsFilmsOb
import com.nttdata.test.everis_becamobile_android.repository.DetailsFilmsRepository
import com.nttdata.test.everis_becamobile_android.utils.Network
import com.nttdata.test.everis_becamobile_android.viewmodel.DetailsViewModel
import com.nttdata.test.everis_becamobile_android.viewmodel.DetailsViewModelFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DetailsActivity : AppCompatActivity() {
    private val binding by lazy { ActivityDetailsBinding.inflate(layoutInflater) }
    private var filmId: Int = 0
    private lateinit var detailsRepository: DetailsFilmsRepository
    private lateinit var detailsFactory: DetailsViewModelFactory

    private val detailsFilmsClient: IDetailsFilmsClient by lazy {
        Network.getRetrofitInstance().create(IDetailsFilmsClient::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        filmId = intent.getIntExtra("filmId",0)

        getData(filmId)
    }

    private fun getData(filmId: Int) {
        detailsRepository = DetailsFilmsRepository(detailsFilmsClient)
        detailsFactory = DetailsViewModelFactory(detailsRepository,filmId,"pt-BR")
        val detailsViewModel by viewModels<DetailsViewModel> { detailsFactory }

        detailsViewModel.fetchDetailsFromRetrofit()
        detailsViewModel.details.observe(this){details->
            setupUi(details[0])
        }


//        lifecycleScope.launch {
//            var details: DetailsFilmsOb? = null
//
//            withContext(Dispatchers.IO){
//                var resultDetails = detailsFilmsClient.getDetailsFilms(filmId,"pt-BR")
//                if (resultDetails.id == null){
//                    resultDetails = detailsFilmsClient.getDetailsDefault(filmId)
//                }
//                details = resultDetails
//            }
//            details?.let { setupUi(it) }
//        }
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