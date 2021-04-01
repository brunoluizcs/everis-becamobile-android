package com.example.moviesapp.repository

import android.content.Context
import android.widget.Toast
import com.example.moviesapp.api.MovieRestApiTask
import com.example.moviesapp.model.Movie
import com.example.moviesapp.model.MoviesResult
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesRepository(private val movieRestApiTask: MovieRestApiTask){

    companion object{
        private const val REQUEST_SUCCESS = 200
    }

    fun getTrendingMovies(context: Context, onSuccess: (List<Movie>) -> Unit, onError: (Context, Int?) -> Unit) {
        val request = movieRestApiTask.retrofitApi().getWeekTrendingMovies()

        request.enqueue(object: Callback<MoviesResult>{
            override fun onResponse(call: Call<MoviesResult>, response: Response<MoviesResult>) {
                val responseCode = response.code()

                if(responseCode == REQUEST_SUCCESS){
                    val moviesList = response.body()!!.results
                    onSuccess.invoke(moviesList)
                }else{
                    onError.invoke(context, responseCode)
                }
            }

            override fun onFailure(call: Call<MoviesResult>, t: Throwable) {
                Toast.makeText(context, t.message, Toast.LENGTH_SHORT).show()
            }

        })


    }

    fun getMovieDetails(movieId: Int, context: Context, onSuccess: (Movie) -> Unit, onError: (Context, Int?) -> Unit) {
        val request = movieRestApiTask.retrofitApi().getMovieDetails(movieId)

        request.enqueue(object: Callback<Movie>{
            override fun onFailure(call: Call<Movie>, t: Throwable){
                Toast.makeText(context, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<Movie>, response: Response<Movie>) {
                val responseCode = response.code()

                if(responseCode == REQUEST_SUCCESS){
                    val movie = response.body()

                    if(movie != null){
                        onSuccess.invoke(movie)
                    }else{
                        onError.invoke(context, null)
                    }
                }else{
                    onError.invoke(context, responseCode)
                }
            }
        })
    }
}
