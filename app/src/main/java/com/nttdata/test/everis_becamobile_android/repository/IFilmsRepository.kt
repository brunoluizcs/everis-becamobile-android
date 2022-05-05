package com.nttdata.test.everis_becamobile_android.repository

import com.nttdata.test.everis_becamobile_android.model.trending_films.JsonFilms

interface IFilmsRepository {

    suspend fun getFilmsAllWeekRepository():JsonFilms

    suspend fun getFilmsPathRepository(mediaType: String, timeWindow: String): JsonFilms
}