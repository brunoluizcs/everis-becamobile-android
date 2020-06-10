package com.example.moviedb.ui.detail

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.moviedb.R
import com.example.moviedb.di.component.DaggerActivityComponent
import com.example.moviedb.di.module.ActivityModule
import com.example.moviedb.models.Movie
import com.example.moviedb.models.ResultCasts
import com.example.moviedb.ui.webview.OfficialPageMovieActivity
import com.example.moviedb.util.Constants
import com.example.moviedb.util.Helpers
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detail_movie.*
import javax.inject.Inject

class DetailMovieActivity : AppCompatActivity(), DetailMovieContract.View {

    @Inject
    lateinit var presenter: DetailMovieContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        injectDependency()

        configureInitialData()
    }

    override fun configureInitialData() {
        if (Helpers.verifyAvailableNetwork(this)) {
            textViewNoInternet.visibility = View.INVISIBLE
            loadDataMovieDetail()
        } else {
            textViewNoInternet.visibility = View.VISIBLE
        }
    }

    private fun loadDataMovieDetail() {
        val movieId = intent.getIntExtra("movie_id", 0)
        presenter.loadDataMovie(movieId)
        presenter.loadDataCreditsMovie(movieId)
    }

    override fun onResume() {
        super.onResume()
        presenter.attach(this)
        presenter.subscribe()
    }

    private fun injectDependency() {
        val listComponent = DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this))
            .build()

        listComponent.injectDetailMovieActivity(this)
    }

    override fun showDataMovieSuccess(movie: Movie) {
        durationTextView.text = movie.runtime.toString() + " minutes"
        Picasso.get().load(Constants.BASE_URL_IMAGE_ORIGINAL + movie.posterPath).into(image_poster_background)
        overviewHeader.text = movie.overview
        genresTextView.text = movie.genres[0].name
        languageTextView.text = movie.languages[0].name
        this.supportActionBar?.title = movie.title

        officialPageButton.setOnClickListener {
            val intent = Intent(this, OfficialPageMovieActivity::class.java)
            intent.putExtra("link", movie.homepage)
            startActivity(intent)
        }
    }

    override fun showDataCreditsSuccess(resultCasts: ResultCasts) {
        Log.i("movie", resultCasts.id.toString())
    }

    override fun showErrorMessage(error: String) {
        Log.e("Error", error)
    }

    override fun showProgress(show: Boolean) {
        if (show) {
            progressBar.visibility = View.VISIBLE
        } else {
            progressBar.visibility = View.GONE
        }
    }
}
