package com.example.moviedb.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u000bH\u0014J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001e"}, d2 = {"Lcom/example/moviedb/ui/detail/DetailMovieActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/moviedb/ui/detail/DetailMovieContract$View;", "()V", "presenter", "Lcom/example/moviedb/ui/detail/DetailMovieContract$Presenter;", "getPresenter", "()Lcom/example/moviedb/ui/detail/DetailMovieContract$Presenter;", "setPresenter", "(Lcom/example/moviedb/ui/detail/DetailMovieContract$Presenter;)V", "configureInitialData", "", "injectDependency", "loadDataMovieDetail", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "showDataCreditsSuccess", "resultCasts", "Lcom/example/moviedb/models/ResultCasts;", "showDataMovieSuccess", "movie", "Lcom/example/moviedb/models/Movie;", "showErrorMessage", "error", "", "showProgress", "show", "", "app_debug"})
public final class DetailMovieActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.moviedb.ui.detail.DetailMovieContract.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.moviedb.ui.detail.DetailMovieContract.Presenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedb.ui.detail.DetailMovieContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.ui.detail.DetailMovieContract.Presenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void configureInitialData() {
    }
    
    private final void loadDataMovieDetail() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    private final void injectDependency() {
    }
    
    @java.lang.Override()
    public void showDataMovieSuccess(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.models.Movie movie) {
    }
    
    @java.lang.Override()
    public void showDataCreditsSuccess(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.models.ResultCasts resultCasts) {
    }
    
    @java.lang.Override()
    public void showErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void showProgress(boolean show) {
    }
    
    public DetailMovieActivity() {
        super();
    }
}