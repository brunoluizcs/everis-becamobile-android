package com.nttdata.test.everis_becamobile_android.data.repository

import com.nttdata.test.everis_becamobile_android.data.remote.IDetailsFilmsClient
import com.nttdata.test.everis_becamobile_android.domain.model.details_films.DetailsFilmsOb
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DetailsFilmsRepository(private val detailsFilmsClient: IDetailsFilmsClient): IDetailsFilmsRepository {
    override suspend fun getDetailsFilms(movieId: Int, language: String): DetailsFilmsOb {
        return withContext(Dispatchers.IO){
             detailsFilmsClient.getDetailsFilms(movieId,language)
        }

    }

    override suspend fun getDetailsDefault(movieId: Int): DetailsFilmsOb {

        return withContext(Dispatchers.IO){
             detailsFilmsClient.getDetailsDefault(movieId)
        }

    }
}