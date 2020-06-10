package com.example.moviedb.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/moviedb/di/component/ActivityComponent;", "", "inject", "", "mainActivity", "Lcom/example/moviedb/ui/main/MainActivity;", "injectDetailMovieActivity", "detailMovieActivity", "Lcom/example/moviedb/ui/detail/DetailMovieActivity;", "app_debug"})
@dagger.Component(modules = {com.example.moviedb.di.module.ActivityModule.class})
public abstract interface ActivityComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.ui.main.MainActivity mainActivity);
    
    public abstract void injectDetailMovieActivity(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.ui.detail.DetailMovieActivity detailMovieActivity);
}