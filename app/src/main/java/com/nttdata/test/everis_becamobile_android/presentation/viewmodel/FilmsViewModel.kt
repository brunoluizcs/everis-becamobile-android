package com.nttdata.test.everis_becamobile_android.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.*
import com.nttdata.test.everis_becamobile_android.data.repository.IFilmsRepository
import com.nttdata.test.everis_becamobile_android.data.repository.IGenreRepository
import com.nttdata.test.everis_becamobile_android.domain.model.AdapterHelperClass
import com.nttdata.test.everis_becamobile_android.domain.model.Genre
import com.nttdata.test.everis_becamobile_android.domain.model.trending_films.Result
import kotlinx.coroutines.launch

class FilmsViewModel(
    private val filmsRepository: IFilmsRepository,
    private val genresRepository: IGenreRepository,
    private val mediaType: String?,
    private val timeWindow: String?,
    private val language: String?
) : ViewModel() {

    private val _films = MutableLiveData<List<Result>>()
    val films: LiveData<List<Result>> = _films

    private val _genres = MutableLiveData<List<Genre>>()
    val genre: LiveData<List<Genre>> = _genres

    private val _adapterHelper = MutableLiveData<List<AdapterHelperClass>>()
    val adapterHelper: LiveData<List<AdapterHelperClass>> = _adapterHelper

    // Fetch = Get
    fun fetchFilmsFromRetrofit() {
        viewModelScope.launch {
            var filmsFromApi: List<Result> = emptyList()
            var genresFromApi: List<Genre> = emptyList()
            var result: MutableList<AdapterHelperClass> = ArrayList()
            if (!mediaType.isNullOrEmpty() && !timeWindow.isNullOrEmpty()) {
                filmsFromApi = filmsRepository.getFilmsPathRepository(mediaType, timeWindow).results
            } else {
                filmsFromApi = filmsRepository.getFilmsAllWeekRepository().results
            }
            if (language != null) {
                genresFromApi = genresRepository.getGenresLanguage(language).genres
            } else {
                genresFromApi = genresRepository.getGenresDefault().genres
            }
            _genres.value = genresFromApi
            _films.value = filmsFromApi

            Log.d("result", "filmsResult: $films")
            var count = 0
            filmsFromApi.forEach {
                result.add(
                    AdapterHelperClass(
                        count,
                        it,
                        genresFromApi
                    )
                )
                count++
                Log.d("result", "count: $count")
            }
            _adapterHelper.value = result
        }
    }
}

class FilmsViewModelFactory(
    private val filmsRepository: IFilmsRepository,
    private val genresRepository: IGenreRepository,
    private val mediaType: String?,
    private val timeWindow: String?,
    private val language: String?
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return FilmsViewModel(
            filmsRepository,
            genresRepository,
            mediaType,
            timeWindow,
            language
        ) as T
    }
}
