package com.nttdata.test.everis_becamobile_android.data.repository

import com.nttdata.test.everis_becamobile_android.domain.model.GenresJson

interface IGenreRepository {

    suspend fun getGenresLanguage(language:String):GenresJson

    suspend fun getGenresDefault(): GenresJson

}