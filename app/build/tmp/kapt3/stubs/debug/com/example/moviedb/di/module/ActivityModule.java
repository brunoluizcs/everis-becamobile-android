package com.example.moviedb.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/moviedb/di/module/ActivityModule;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "provideActivity", "providePresenter", "Lcom/example/moviedb/ui/main/MainContract$Presenter;", "providePresenterMovieDetail", "Lcom/example/moviedb/ui/detail/DetailMovieContract$Presenter;", "app_debug"})
@dagger.Module()
public final class ActivityModule {
    private android.app.Activity activity;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.app.Activity provideActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.moviedb.ui.main.MainContract.Presenter providePresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.moviedb.ui.detail.DetailMovieContract.Presenter providePresenterMovieDetail() {
        return null;
    }
    
    public ActivityModule(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        super();
    }
}