package com.everis.catalogfilme.intefaces

import com.everis.catalogfilme.model.Posts
import retrofit2.Call
import retrofit2.http.GET

interface Endpoint {
    @GET("posts")
    fun getPosts() : Call<List<Posts>>

}