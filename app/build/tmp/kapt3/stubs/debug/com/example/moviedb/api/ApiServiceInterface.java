package com.example.moviedb.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/moviedb/api/ApiServiceInterface;", "", "getCredits", "Lio/reactivex/Observable;", "Lcom/example/moviedb/models/ResultCasts;", "movieId", "", "getMovie", "Lcom/example/moviedb/models/Movie;", "getMovieList", "Lcom/example/moviedb/models/Data;", "getMovieListSearch", "query", "", "Factory", "app_debug"})
public abstract interface ApiServiceInterface {
    public static final com.example.moviedb.api.ApiServiceInterface.Factory Factory = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "discover/movie?api_key=7aeb3719314193444e0bf20ce17b90a0")
    public abstract io.reactivex.Observable<com.example.moviedb.models.Data> getMovieList();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/movie?api_key=7aeb3719314193444e0bf20ce17b90a0")
    public abstract io.reactivex.Observable<com.example.moviedb.models.Data> getMovieListSearch(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "query")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}/credits?api_key=7aeb3719314193444e0bf20ce17b90a0")
    public abstract io.reactivex.Observable<com.example.moviedb.models.ResultCasts> getCredits(@retrofit2.http.Path(value = "movie_id")
    int movieId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}?api_key=7aeb3719314193444e0bf20ce17b90a0")
    public abstract io.reactivex.Observable<com.example.moviedb.models.Movie> getMovie(@retrofit2.http.Path(value = "movie_id")
    int movieId);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/moviedb/api/ApiServiceInterface$Factory;", "", "()V", "create", "Lcom/example/moviedb/api/ApiServiceInterface;", "app_debug"})
    public static final class Factory {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviedb.api.ApiServiceInterface create() {
            return null;
        }
        
        private Factory() {
            super();
        }
    }
}