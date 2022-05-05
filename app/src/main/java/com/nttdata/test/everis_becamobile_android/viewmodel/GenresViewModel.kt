package com.nttdata.test.everis_becamobile_android.viewmodel

import androidx.lifecycle.*
import com.nttdata.test.everis_becamobile_android.model.Genre
import com.nttdata.test.everis_becamobile_android.repository.IGenreRepository
import kotlinx.coroutines.launch

class GenresViewModel(
    private val genresRepository: IGenreRepository,
    private val language:String?
):ViewModel() {

    private val _genres = MutableLiveData<List<Genre>>()
    val genre: LiveData<List<Genre>> = _genres

    fun fetchGenresFromRetrofit(){
        viewModelScope.launch {
            val genresFromApi:List<Genre>
            if (!language.isNullOrEmpty()){
                genresFromApi = genresRepository.getGenresLanguage(language).genres
            }else{
                genresFromApi = genresRepository.getGenresDefault().genres
            }
            _genres.value = genresFromApi

        }
    }
}

class GenresViewModelFactory(
    private val repository: IGenreRepository,
    private val language:String?
): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return GenresViewModel(repository,language) as T
    }

}