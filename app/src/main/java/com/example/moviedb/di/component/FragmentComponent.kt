package com.example.moviedb.di.component

import com.example.moviedb.di.module.FragmentModule
import com.example.moviedb.ui.list.ListMoviesFragment
import dagger.Component

@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {
    fun inject(listMoviesFragment: ListMoviesFragment)
}