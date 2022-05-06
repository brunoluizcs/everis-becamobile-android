package com.nttdata.test.everis_becamobile_android.utils

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Network {
    companion object{
        fun getRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(Util.apiURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}