package com.nttdata.test.everis_becamobile_android.repository

import com.nttdata.test.everis_becamobile_android.model.GenresJson

interface IGenreRepository {

    suspend fun getGenresLanguage(language:String):GenresJson

    suspend fun getGenresDefault(): GenresJson

}