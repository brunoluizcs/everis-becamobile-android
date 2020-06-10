package com.example.moviedb.models

import com.google.gson.annotations.SerializedName

class Data {
    @SerializedName("page") var page: Int = 0
    @SerializedName("total_results") var totalResults: Int = 0
    @SerializedName("total_pages") var totalPages: Int = 0
    @SerializedName("results")
    lateinit var results: List<Movie>
}

class Movie {
    @SerializedName("id") var id: Int = 0
    @SerializedName("poster_path") var posterPath: String? = null
    @SerializedName("vote_average") var voteAvegare: Float? = null
    @SerializedName("genre_ids") lateinit var genreIds: Array<Int>
    @SerializedName("release_date") var releaseDate: String? = null
    @SerializedName("title") var title: String? = null
    @SerializedName("overview") var overview: String? = null
    @SerializedName("runtime") var runtime: Int = 0
    @SerializedName("homepage") var homepage: String? = null
    @SerializedName("budget") var budget: Double = 0.0
    @SerializedName("revenue") var revenue: Double = 0.0
    @SerializedName("genres")
    lateinit var genres: List<Genre>
    @SerializedName("spoken_languages")
    lateinit var languages: List<Language>
}

class Genre {
    @SerializedName("id") var id: Int = 0
    @SerializedName("name") var name: String? = null
}

class Language {
    @SerializedName("iso_639_1") var iso: String? = null
    @SerializedName("name") var name: String? = null
}