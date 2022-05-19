package com.nttdata.test.everis_becamobile_android.domain.model

import com.nttdata.test.everis_becamobile_android.domain.model.trending_films.Result

data class AdapterHelperClass(
    var id: Int?,
    var film: Result?,
    var listGenre: List<Genre>?
)
