package com.example.moviedb.ui.list

import com.example.moviedb.api.ApiServiceInterface
import com.example.moviedb.models.Data
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class ListMoviesPresenter : ListMoviesContract.Presenter {

    private val subscriptions = CompositeDisposable()
    private val api: ApiServiceInterface = ApiServiceInterface.create()
    private lateinit var view: ListMoviesContract.View

    override fun loadData(items: Int) {
        val subscribe = api.getMovieList().subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ list: Data? ->
                view.showProgress(false)
                view.loadDataSuccess(list?.results!!.take(items))
            }, { error ->
                view.showProgress(false)
                view.showErrorMessage(error.localizedMessage)
            })

        subscriptions.add(subscribe)
    }

    override fun loadDataAll() {

    }

    override fun subscribe() {

    }

    override fun unsubscribe() {
        subscriptions.clear()
    }

    override fun attach(view: ListMoviesContract.View) {
        this.view = view
    }

}