package com.nttdata.test.everis_becamobile_android.repository

import com.nttdata.test.everis_becamobile_android.client.IFilmsClient
import com.nttdata.test.everis_becamobile_android.model.trending_films.JsonFilms
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmsRepository(private val filmsClient: IFilmsClient):IFilmsRepository {
    override suspend fun getFilmsAllWeekRepository(): JsonFilms {
        return withContext(Dispatchers.IO){
            filmsClient.getTreadingAllWeek()
        }

    }

    override suspend fun getFilmsPathRepository(
        mediaType:String,
        timeWindow:String
    ): JsonFilms {

        return withContext(Dispatchers.IO){
            filmsClient.getTreadingFilmsPath(mediaType,timeWindow)
        }

    }

}