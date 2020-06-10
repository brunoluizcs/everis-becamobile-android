package com.example.moviedb.di.component

import com.example.moviedb.di.module.ActivityModule
import com.example.moviedb.ui.detail.DetailMovieActivity
import com.example.moviedb.ui.main.MainActivity
import dagger.Component

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
    fun injectDetailMovieActivity(detailMovieActivity: DetailMovieActivity)
}