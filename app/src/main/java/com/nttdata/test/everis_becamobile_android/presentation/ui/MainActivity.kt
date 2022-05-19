package com.nttdata.test.everis_becamobile_android.presentation.ui

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.lifecycleScope
import com.afdhal_fa.imageslider.`interface`.ItemClickListener
import com.afdhal_fa.imageslider.model.SlideUIModel
import com.nttdata.test.everis_becamobile_android.R
import com.nttdata.test.everis_becamobile_android.data.remote.IFilmsClient
import com.nttdata.test.everis_becamobile_android.data.remote.IGenreClient
import com.nttdata.test.everis_becamobile_android.data.repository.FilmsRepository
import com.nttdata.test.everis_becamobile_android.data.repository.GenreRepository
import com.nttdata.test.everis_becamobile_android.databinding.ActivityMainBinding
import com.nttdata.test.everis_becamobile_android.domain.model.AdapterHelperClass
import com.nttdata.test.everis_becamobile_android.domain.utils.Network
import com.nttdata.test.everis_becamobile_android.presentation.viewmodel.FilmsViewModel
import com.nttdata.test.everis_becamobile_android.presentation.viewmodel.FilmsViewModelFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// Chave da API (v3 auth)= a822459f243b669b1a5d829c771e50e7
// Exemplo de Requisição de API= https://api.themoviedb.org/3/movie/550?api_key=a822459f243b669b1a5d829c771e50e7
// Token de Leitura da API (v4 auth) = eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJhODIyNDU5ZjI0M2I2NjliMWE1ZDgyOWM3NzFlNTBlNyIsInN1YiI6IjYyNzAwZmU1YzU2ZDJkNmY3NDg1ZjYwMCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.wLF924nHRyXAO63TfhEyZKyxwiEQf5-IbbgluAWvx5c

class MainActivity : AppCompatActivity() {
    private var adapterHelperList: MutableList<AdapterHelperClass> = ArrayList()
    private var languageSelected: String? = null
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private val filmsClient: IFilmsClient by lazy {
        Network.getRetrofitInstance().create(IFilmsClient::class.java)
    }
    private val genreClient: IGenreClient by lazy {
        Network.getRetrofitInstance().create(IGenreClient::class.java)
    }

    // private val sharedPref = getPreferences(Context.MODE_PRIVATE)
    private val defaultValue = "en-EN"
    // val languageSelected = sharedPref.getString(Constants.language, defaultValue)

    private val filmsRepository = FilmsRepository(filmsClient)
    private val genresRepository = GenreRepository(genreClient)
    private val filmsFactory = FilmsViewModelFactory(
        filmsRepository,
        genresRepository,
        "all",
        "week",
        defaultValue
    )
    private val filmsViewModel by viewModels<FilmsViewModel> { filmsFactory }

//    private val genresRepository = GenreRepository(genreClient)
//    private val genresFactory = GenresViewModelFactory(genresRepository, "pt-BR")
//    private val genresViewModel by viewModels<GenresViewModel> { genresFactory }

    private lateinit var adapterFilms: AdapterFilms
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        configNightMode()

        setupUi()

        binding.ivProfile.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ConfigActivity::class.java
                )
            )
        }
    }

    private fun configNightMode() {
        when (resources?.configuration?.uiMode?.and(Configuration.UI_MODE_NIGHT_MASK)) {
            Configuration.UI_MODE_NIGHT_YES -> {
                binding.sliderDestaques.background.setTint(this.resources.getColor(R.color.black_mais_fraco))
                binding.recyclerViewListFilms.background.setTint(this.resources.getColor(R.color.black_mais_fraco))
                binding.searchView.background.setTint(this.resources.getColor(R.color.black_mais_fraco))
            }
            Configuration.UI_MODE_NIGHT_NO -> {
                binding.sliderDestaques.background.setTint(this.resources.getColor(R.color.cinza_fraco))
                binding.recyclerViewListFilms.background.setTint(this.resources.getColor(R.color.cinza_fraco))
                binding.searchView.background.setTint(this.resources.getColor(R.color.cinza_fraco))
            }
            Configuration.UI_MODE_NIGHT_UNDEFINED -> {
                binding.sliderDestaques.background.setTint(this.resources.getColor(R.color.cinza_fraco))
                binding.recyclerViewListFilms.background.setTint(this.resources.getColor(R.color.cinza_fraco))
                binding.searchView.background.setTint(this.resources.getColor(R.color.cinza_fraco))
            }
        }
    }

    private fun setupUi() {
        configAdapter()
    }

    private fun setupSearchView(list: MutableList<AdapterHelperClass>) {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {

                if (!query.isNullOrEmpty()) {
                    val newList: MutableList<AdapterHelperClass> = ArrayList()
                    list.forEach {
                        val title = it.film!!.title
                        val name = it.film!!.name
                        Log.d("result", "title: $title + $name")
                        if (!title.isNullOrEmpty() && title.uppercase()
                            .contains(query.uppercase())
                        ) {
                            newList.add(it)
                        } else if (title.isNullOrEmpty() && name.uppercase()
                            .contains(query.uppercase())
                        ) {
                            newList.add(it)
                        }
                    }
                    // Log.d("result", "onQueryTextSubmit: $newList")
                    if (newList.isNotEmpty()) {
                        setListAdapter(newList)
                    } else {
                        setListAdapter(adapterHelperList)
                        Toast.makeText(
                            applicationContext,
                            "Filme Não encontrado",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }

                if (query != null) {
                    binding.searchView.setQuery("", false)
                }
                binding.searchView.setIconifiedByDefault(true)
                binding.searchView.clearFocus()
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {

                return false
            }
        })
    }

    private fun configAdapter() {
        adapterFilms = AdapterFilms()

        adapterFilms.onClickListener = { filmId ->
            startDatailsActiviy(filmId)
        }

        binding.recyclerViewListFilms.adapter = adapterFilms

        // setListAdapter(resultMock())
        getDataFilms()
    }

    private fun startDatailsActiviy(filmId: Int) {
        val i = Intent(applicationContext, DetailsActivity::class.java)
        i.putExtra("filmId", filmId)
        startActivity(i)
    }

    private fun getDataFilms() {
        filmsViewModel.fetchFilmsFromRetrofit()
        filmsViewModel.adapterHelper.observe(this) { films ->
            if (films != null) {
                setListAdapter(films)
                setSliderView(films)

                adapterHelperList.addAll(films.toMutableList())
                if (adapterHelperList != null) {
                    setupSearchView(adapterHelperList)
                }
            }
        }

//        genresViewModel.fatchGenresFromRetrofit()
//        genresViewModel.genre.observe(this) { genres ->
//
//        }

//        lifecycleScope.launch {
//            var count = 0
//            var resultFilms: List<Result> = emptyList()
//            var resultGenre: List<Genre> = emptyList()
//            withContext(Dispatchers.IO) {
//                try {
//                    //Get Films list
//                    resultFilms = filmsClient.getTreadingFilmsPath("all", "day").results
//                    Log.d("result", "resultFilms: $resultFilms")
//                    //val result = filmsClient.getTreadingAllWeek().results
//
//                    //Get Genres list
//                    resultGenre = genreClient.getGenresLanguage("pt-Br").genres
//                    Log.d("result", "resultGenre: $resultGenre")
//
//                } catch (e: Exception) {
//                    e.message
//                    e.printStackTrace()
//                }
//            }
//            //Set lists results
//
//            resultFilms.forEach {
//                adapterHelperList.add(
//                    AdapterHelperClass(
//                        count,
//                        it,
//                        resultGenre
//                    )
//                )
//                count++
//                Log.d("result", "count: $count")
//            }
//
//            adapterHelperList?.let { setListAdapter(it) }
//            Log.d("result", "adapterHelper: $adapterHelperList")
//        }
    }

    private fun setSliderView(films: List<AdapterHelperClass>) {

        lifecycleScope.launch {
            var count = 0
            var list: MutableList<SlideUIModel> = ArrayList()
            films.sortedBy { it.film?.vote_average }
            withContext(Dispatchers.IO) {
                while (count <= 5) {
                    if (!films[count].film?.title.isNullOrEmpty()) {
                        list.add(
                            SlideUIModel(
                                "https://image.tmdb.org/t/p/w500" + films[count].film!!.backdrop_path,
                                films[count].film!!.title
                            )
                        )
                        count++
                    } else {
                        list.add(
                            SlideUIModel(
                                "https://image.tmdb.org/t/p/w500" + films[count].film!!.backdrop_path,
                                films[count].film!!.name
                            )
                        )
                        count++
                    }
                }
                binding.sliderDestaques.setImageList(list)
            }

            binding.sliderDestaques.setItemClickListener(object : ItemClickListener {
                override fun onItemClick(model: SlideUIModel, position: Int) {
                    films.forEach {
                        if (model.title.equals(it.film?.title) ||
                            model.title.equals(it.film?.name)
                        ) {
                            it.film?.let { it1 -> startDatailsActiviy(it1.id) }
                        }
                    }
                }
            })
        }
    }

    private fun setListAdapter(result: List<AdapterHelperClass>) {

        adapterFilms.submitList(result)
        adapterFilms.notifyDataSetChanged()
    }
}
