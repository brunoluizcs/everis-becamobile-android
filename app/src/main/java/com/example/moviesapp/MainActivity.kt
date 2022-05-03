package com.example.moviesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.moviesapp.databinding.ActivityMainBinding
import com.example.moviesapp.model.mockMovies

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val movieListAdapter = MovieItemAdapter()
        binding.movieListRecyclerView.adapter = movieListAdapter
        movieListAdapter.submitList(mockMovies())

        movieListAdapter.onClickListener = { movieId ->
            Toast.makeText(this,"Filme selecionado: $movieId", Toast.LENGTH_SHORT).show()
        }
    }
}