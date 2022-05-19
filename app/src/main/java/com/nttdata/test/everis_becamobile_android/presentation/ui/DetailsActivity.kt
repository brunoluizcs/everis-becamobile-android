package com.nttdata.test.everis_becamobile_android.presentation.ui

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.nttdata.test.everis_becamobile_android.data.remote.IDetailsFilmsClient
import com.nttdata.test.everis_becamobile_android.data.repository.DetailsFilmsRepository
import com.nttdata.test.everis_becamobile_android.databinding.ActivityDetailsBinding
import com.nttdata.test.everis_becamobile_android.domain.model.details_films.DetailsFilmsOb
import com.nttdata.test.everis_becamobile_android.domain.utils.Constants
import com.nttdata.test.everis_becamobile_android.domain.utils.Network
import com.nttdata.test.everis_becamobile_android.presentation.viewmodel.DetailsViewModel
import com.nttdata.test.everis_becamobile_android.presentation.viewmodel.DetailsViewModelFactory

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

        filmId = intent.getIntExtra("filmId", 0)

        getData(filmId)
    }

    private fun getData(filmId: Int) {

        val sharedPref = getPreferences(Context.MODE_PRIVATE) ?: return
        val defaultValue = "pt-BR"
        val languageSelected = sharedPref.getString(Constants.languageSelected, defaultValue)

        detailsRepository = DetailsFilmsRepository(detailsFilmsClient)
        detailsFactory = DetailsViewModelFactory(detailsRepository, filmId, languageSelected)
        val detailsViewModel by viewModels<DetailsViewModel> { detailsFactory }

        detailsViewModel.fetchDetailsFromRetrofit()
        detailsViewModel.details.observe(this) { details ->
            if (details[0] != null) {
                setupUi(details[0])
            } else {
                error("Por favor, verifique sua internet")
            }
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
        var str = ""
        details.genres.forEach {
            str += it.name + ", "
        }

        binding.tvDetailsTitle.text = details.title
        binding.tvDetailsTitle.contentDescription = details.title
        binding.ivDetailsBanner.contentDescription = details.title

        binding.tvDetailsGenre.text = str.dropLast(2)
        binding.tvDetailsGenre.contentDescription = str.dropLast(2)

        binding.tvDetailsOverview.text = details.overview
        binding.tvDetailsOverview.contentDescription = details.overview
        binding.tvLancamento.text = details.release_date
        binding.tvLancamento.contentDescription = details.release_date

        binding.detailsProgressBar.visibility = View.GONE
        binding.ivDetailsLogo.visibility = View.GONE
        binding.ivDetailsBanner.visibility = View.VISIBLE
        binding.cardView.visibility = View.VISIBLE
    }
}
