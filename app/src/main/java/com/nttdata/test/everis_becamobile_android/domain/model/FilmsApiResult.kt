package com.nttdata.test.everis_becamobile_android.domain.model

sealed class FilmsApiResult<T> {
    class Loading<T> : FilmsApiResult<T>()
    class Sucess<T>(data: T) : FilmsApiResult<T>()
    class Error<T>(throwable: Throwable) : FilmsApiResult<T>()
}
