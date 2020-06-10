package com.example.moviedb.ui.main

import com.example.moviedb.ui.base.BaseContract

class MainContract {

    interface View: BaseContract.View {
        fun showListMoviesFragment()
    }

    interface Presenter: BaseContract.Presenter<MainContract.View> {
        //un onDrawerOptionAboutClick()
    }
}