package com.example.moviesapp.repository

import android.content.Context
import android.widget.Toast
import com.example.moviesapp.api.MovieRestApiTask
import com.example.moviesapp.model.Movie
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MoviesRepository(private val movieRestApiTask: MovieRestApiTask){

    companion object{
        private const val REQUEST_SUCCESS = 200
    }

    fun getTrendingMovies(): List<Movie> {
        val request = movieRestApiTask.retrofitApi().getWeekTrendingMovies().execute()
        return request.body()?.results!!
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
