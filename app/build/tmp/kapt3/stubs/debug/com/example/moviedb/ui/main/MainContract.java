package com.example.moviedb.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/example/moviedb/ui/main/MainContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class MainContract {
    
    public MainContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/moviedb/ui/main/MainContract$View;", "Lcom/example/moviedb/ui/base/BaseContract$View;", "showListMoviesFragment", "", "app_debug"})
    public static abstract interface View extends com.example.moviedb.ui.base.BaseContract.View {
        
        public abstract void showListMoviesFragment();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lcom/example/moviedb/ui/main/MainContract$Presenter;", "Lcom/example/moviedb/ui/base/BaseContract$Presenter;", "Lcom/example/moviedb/ui/main/MainContract$View;", "app_debug"})
    public static abstract interface Presenter extends com.example.moviedb.ui.base.BaseContract.Presenter<com.example.moviedb.ui.main.MainContract.View> {
    }
}