package com.example.moviesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviesapp.databinding.ActivityMainBinding
import com.example.moviesapp.model.MovieResponse
import com.example.moviesapp.model.Movies
import com.example.moviesapp.service.MovieApiInterface
import com.example.moviesapp.service.MovieApiServer
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_movie_list.layoutManager = LinearLayoutManager(this)
        rv_movie_list.setHasFixedSize(true)
        getMovieData { movies : List<Movies> ->
            rv_movie_list.adapter = MovieAdapter(movies)
        }
    }

    private fun getMovieData(callback: (List<Movies>) -> Unit){
        val apiService = MovieApiServer.getInstance().create(MovieApiInterface::class.java)
        apiService.getMovieList().enqueue(object : Callback<MovieResponse> {
            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {

            }

            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                return callback(response.body()!!.movies)
            }

        })
    }
}