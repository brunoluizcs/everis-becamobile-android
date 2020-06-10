package com.example.moviedb.di.module

import android.app.Activity
import com.example.moviedb.ui.detail.DetailMovieContract
import com.example.moviedb.ui.detail.DetailMoviePresenter
import com.example.moviedb.ui.main.MainContract
import com.example.moviedb.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

    @Provides
    fun providePresenterMovieDetail(): DetailMovieContract.Presenter {
        return DetailMoviePresenter()
    }
}