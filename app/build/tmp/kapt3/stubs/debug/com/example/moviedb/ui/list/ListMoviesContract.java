package com.example.moviedb.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/example/moviedb/ui/list/ListMoviesContract;", "", "()V", "Presenter", "View", "app_debug"})
public final class ListMoviesContract {
    
    public ListMoviesContract() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/example/moviedb/ui/list/ListMoviesContract$View;", "Lcom/example/moviedb/ui/base/BaseContract$View;", "loadDataSuccess", "", "list", "", "Lcom/example/moviedb/models/Movie;", "showErrorMessage", "error", "", "showProgress", "show", "", "app_debug"})
    public static abstract interface View extends com.example.moviedb.ui.base.BaseContract.View {
        
        public abstract void showProgress(boolean show);
        
        public abstract void showErrorMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String error);
        
        public abstract void loadDataSuccess(@org.jetbrains.annotations.NotNull()
        java.util.List<com.example.moviedb.models.Movie> list);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&\u00a8\u0006\b"}, d2 = {"Lcom/example/moviedb/ui/list/ListMoviesContract$Presenter;", "Lcom/example/moviedb/ui/base/BaseContract$Presenter;", "Lcom/example/moviedb/ui/list/ListMoviesContract$View;", "loadData", "", "items", "", "loadDataAll", "app_debug"})
    public static abstract interface Presenter extends com.example.moviedb.ui.base.BaseContract.Presenter<com.example.moviedb.ui.list.ListMoviesContract.View> {
        
        public abstract void loadData(int items);
        
        public abstract void loadDataAll();
    }
}