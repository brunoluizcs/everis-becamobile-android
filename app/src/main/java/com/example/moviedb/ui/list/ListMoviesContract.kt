package com.example.moviedb.ui.list

import com.example.moviedb.models.Movie
import com.example.moviedb.ui.base.BaseContract

class ListMoviesContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<Movie>)
        //fun loadDataAllSuccess(model: DetailsViewModel)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData(items: Int)
        fun loadDataAll()
    }
}