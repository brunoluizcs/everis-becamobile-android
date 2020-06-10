package com.example.moviedb.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/moviedb/ui/detail/DetailMoviePresenter;", "Lcom/example/moviedb/ui/detail/DetailMovieContract$Presenter;", "()V", "api", "Lcom/example/moviedb/api/ApiServiceInterface;", "subscriptions", "Lio/reactivex/disposables/CompositeDisposable;", "view", "Lcom/example/moviedb/ui/detail/DetailMovieContract$View;", "attach", "", "loadDataCreditsMovie", "movieId", "", "loadDataMovie", "subscribe", "unsubscribe", "app_debug"})
public final class DetailMoviePresenter implements com.example.moviedb.ui.detail.DetailMovieContract.Presenter {
    private final io.reactivex.disposables.CompositeDisposable subscriptions = null;
    private final com.example.moviedb.api.ApiServiceInterface api = null;
    private com.example.moviedb.ui.detail.DetailMovieContract.View view;
    
    @java.lang.Override()
    public void loadDataMovie(int movieId) {
    }
    
    @java.lang.Override()
    public void loadDataCreditsMovie(int movieId) {
    }
    
    @java.lang.Override()
    public void subscribe() {
    }
    
    @java.lang.Override()
    public void unsubscribe() {
    }
    
    @java.lang.Override()
    public void attach(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.ui.detail.DetailMovieContract.View view) {
    }
    
    public DetailMoviePresenter() {
        super();
    }
}