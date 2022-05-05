package com.nttdata.test.everis_becamobile_android.repository

import com.nttdata.test.everis_becamobile_android.client.IGenreClient
import com.nttdata.test.everis_becamobile_android.model.GenresJson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GenreRepository(private val iGenreClient: IGenreClient):IGenreRepository {
    override suspend fun getGenresLanguage(language: String): GenresJson {
        return withContext(Dispatchers.IO){
            iGenreClient.getGenresLanguage(language)
        }

    }

    override suspend fun getGenresDefault(): GenresJson {
        return withContext(Dispatchers.IO){
            iGenreClient.getGenresDefault()
        }

    }
}