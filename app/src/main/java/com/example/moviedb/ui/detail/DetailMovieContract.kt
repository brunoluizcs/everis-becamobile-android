package com.example.moviedb.ui.detail

import com.example.moviedb.models.Movie
import com.example.moviedb.models.ResultCasts
import com.example.moviedb.ui.base.BaseContract

class DetailMovieContract {
    interface View : BaseContract.View {
        fun showDataMovieSuccess(movie: Movie)
        fun showDataCreditsSuccess(resultCasts: ResultCasts)
        fun showErrorMessage(error: String)
        fun showProgress(show: Boolean)
        fun configureInitialData()
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadDataMovie(movieId: Int)
        fun loadDataCreditsMovie(movieId: Int)
    }
}