package com.nttdata.test.everis_becamobile_android.data.repository

import com.nttdata.test.everis_becamobile_android.domain.model.details_films.DetailsFilmsOb

interface IDetailsFilmsRepository {

    suspend fun getDetailsFilms(movieId:Int,language:String):DetailsFilmsOb

    suspend fun getDetailsDefault(movieId: Int):DetailsFilmsOb
}