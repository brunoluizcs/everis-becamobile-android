package com.example.moviedb.di.component

import com.example.moviedb.BaseApp
import com.example.moviedb.di.module.ApplicationModule
import dagger.Component

@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun inject(application: BaseApp)
}