package com.nttdata.test.everis_becamobile_android.data.repository

import com.nttdata.test.everis_becamobile_android.data.remote.IFilmsClient
import com.nttdata.test.everis_becamobile_android.domain.model.trending_films.JsonFilms
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FilmsRepository(private val filmsClient: IFilmsClient) : IFilmsRepository {
    override suspend fun getFilmsAllWeekRepository(): JsonFilms {
        return withContext(Dispatchers.IO) {
            filmsClient.getTreadingAllWeek()
        }
    }

    override suspend fun getFilmsPathRepository(
        mediaType: String,
        timeWindow: String
    ): JsonFilms {

        return withContext(Dispatchers.IO) {
            filmsClient.getTreadingFilmsPath(mediaType, timeWindow)
        }
    }
}
