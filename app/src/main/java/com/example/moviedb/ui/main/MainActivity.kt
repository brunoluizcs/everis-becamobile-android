package com.example.moviedb.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviedb.R
import com.example.moviedb.di.component.DaggerActivityComponent
import com.example.moviedb.di.module.ActivityModule
import com.example.moviedb.ui.list.ListMoviesFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {

    @Inject
    lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectDependency()
        presenter.attach(this)

        showListMoviesFragment()
    }

    override fun showListMoviesFragment() {
        supportFragmentManager.beginTransaction()
            .disallowAddToBackStack()
            .replace(R.id.frame, ListMoviesFragment().newInstance(), ListMoviesFragment.TAG)
            .commit()
    }

    private fun injectDependency() {
        val activityComponent = DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this))
            .build()

        activityComponent.inject(this)
    }
}
