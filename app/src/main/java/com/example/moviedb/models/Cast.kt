package com.example.moviedb.models

import com.google.gson.annotations.SerializedName

class ResultCasts {
    @SerializedName("id") var id: Int = 0
    @SerializedName("cast") lateinit var cast: List<Cast>
}

class Cast {
    @SerializedName("cast_id") var castId: Int = 0
    @SerializedName("character") var character: String = ""
    @SerializedName("credit_id") var creditId: String = ""
    @SerializedName("gender") var gender: String = ""
    @SerializedName("id") var id: Int = 0
    @SerializedName("name") var name: String = ""
    @SerializedName("order") var order: Int = 0
    @SerializedName("profile_path") var profilePath: String = ""
}