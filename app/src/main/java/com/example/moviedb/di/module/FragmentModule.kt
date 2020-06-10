package com.example.moviedb.di.module

import com.example.moviedb.api.ApiServiceInterface
import com.example.moviedb.ui.list.ListMoviesContract
import com.example.moviedb.ui.list.ListMoviesPresenter
import dagger.Module
import dagger.Provides

@Module
class FragmentModule {

    @Provides
    fun provideListMoviesPresenter(): ListMoviesContract.Presenter {
        return ListMoviesPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}