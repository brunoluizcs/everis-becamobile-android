package com.nttdata.test.everis_becamobile_android.presentation.viewmodel

import androidx.lifecycle.*
import com.nttdata.test.everis_becamobile_android.domain.model.details_films.DetailsFilmsOb
import com.nttdata.test.everis_becamobile_android.data.repository.IDetailsFilmsRepository
import kotlinx.coroutines.launch

class DetailsViewModel(
    private val iDetailsRepository: IDetailsFilmsRepository,
    private val movieId: Int,
    private val language: String?
):ViewModel() {

    private val _details = MutableLiveData<List<DetailsFilmsOb>>()
    val details : LiveData<List<DetailsFilmsOb>> = _details

    fun fetchDetailsFromRetrofit(){
        viewModelScope.launch {
            var detailsFromApi : DetailsFilmsOb
            try {

                if (language.isNullOrEmpty()){
                    val detailsFromApi = iDetailsRepository.getDetailsDefault(movieId)
                    _details.value = listOf(detailsFromApi)
                }else{
                    val detailsFromApi = iDetailsRepository.getDetailsFilms(movieId,language)
                    _details.value = listOf(detailsFromApi)
                }
            }catch (e:Exception){
                e.printStackTrace()
            }
        }
    }
}

class DetailsViewModelFactory(
    private val iDetailsRepository: IDetailsFilmsRepository,
    private val movieId: Int,
    private val language: String?
): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DetailsViewModel(iDetailsRepository,movieId,language) as T
    }

}