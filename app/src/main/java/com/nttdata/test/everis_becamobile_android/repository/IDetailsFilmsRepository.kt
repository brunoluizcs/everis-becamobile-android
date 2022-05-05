package com.nttdata.test.everis_becamobile_android.repository

import com.nttdata.test.everis_becamobile_android.model.details_films.DetailsFilmsOb

interface IDetailsFilmsRepository {

    suspend fun getDetailsFilms(movieId:Int,language:String):DetailsFilmsOb

    suspend fun getDetailsDefault(movieId: Int):DetailsFilmsOb
}