package com.nttdata.test.everis_becamobile_android.data.repository

import com.nttdata.test.everis_becamobile_android.domain.model.trending_films.JsonFilms

interface IFilmsRepository {

    suspend fun getFilmsAllWeekRepository(): JsonFilms

    suspend fun getFilmsPathRepository(mediaType: String, timeWindow: String): JsonFilms
}
