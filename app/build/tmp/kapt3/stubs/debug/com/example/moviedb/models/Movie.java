package com.example.moviedb.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R \u0010\'\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR \u0010*\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR \u0010-\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001b\"\u0004\b/\u0010\u001dR\u001e\u00100\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001e\u00103\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010 \"\u0004\b5\u0010\"R \u00106\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001b\"\u0004\b8\u0010\u001dR\"\u00109\u001a\u0004\u0018\u00010:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010?\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>\u00a8\u0006@"}, d2 = {"Lcom/example/moviedb/models/Movie;", "", "()V", "budget", "", "getBudget", "()D", "setBudget", "(D)V", "genreIds", "", "", "getGenreIds", "()[Ljava/lang/Integer;", "setGenreIds", "([Ljava/lang/Integer;)V", "[Ljava/lang/Integer;", "genres", "", "Lcom/example/moviedb/models/Genre;", "getGenres", "()Ljava/util/List;", "setGenres", "(Ljava/util/List;)V", "homepage", "", "getHomepage", "()Ljava/lang/String;", "setHomepage", "(Ljava/lang/String;)V", "id", "getId", "()I", "setId", "(I)V", "languages", "Lcom/example/moviedb/models/Language;", "getLanguages", "setLanguages", "overview", "getOverview", "setOverview", "posterPath", "getPosterPath", "setPosterPath", "releaseDate", "getReleaseDate", "setReleaseDate", "revenue", "getRevenue", "setRevenue", "runtime", "getRuntime", "setRuntime", "title", "getTitle", "setTitle", "voteAvegare", "", "getVoteAvegare", "()Ljava/lang/Float;", "setVoteAvegare", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "app_debug"})
public final class Movie {
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "poster_path")
    private java.lang.String posterPath;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "vote_average")
    private java.lang.Float voteAvegare;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "genre_ids")
    public java.lang.Integer[] genreIds;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "release_date")
    private java.lang.String releaseDate;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "overview")
    private java.lang.String overview;
    @com.google.gson.annotations.SerializedName(value = "runtime")
    private int runtime;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "homepage")
    private java.lang.String homepage;
    @com.google.gson.annotations.SerializedName(value = "budget")
    private double budget;
    @com.google.gson.annotations.SerializedName(value = "revenue")
    private double revenue;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "genres")
    public java.util.List<com.example.moviedb.models.Genre> genres;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "spoken_languages")
    public java.util.List<com.example.moviedb.models.Language> languages;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPosterPath() {
        return null;
    }
    
    public final void setPosterPath(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getVoteAvegare() {
        return null;
    }
    
    public final void setVoteAvegare(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Integer[] getGenreIds() {
        return null;
    }
    
    public final void setGenreIds(@org.jetbrains.annotations.NotNull()
    java.lang.Integer[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReleaseDate() {
        return null;
    }
    
    public final void setReleaseDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final void setOverview(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getRuntime() {
        return 0;
    }
    
    public final void setRuntime(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHomepage() {
        return null;
    }
    
    public final void setHomepage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final double getBudget() {
        return 0.0;
    }
    
    public final void setBudget(double p0) {
    }
    
    public final double getRevenue() {
        return 0.0;
    }
    
    public final void setRevenue(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.moviedb.models.Genre> getGenres() {
        return null;
    }
    
    public final void setGenres(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviedb.models.Genre> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.moviedb.models.Language> getLanguages() {
        return null;
    }
    
    public final void setLanguages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviedb.models.Language> p0) {
    }
    
    public Movie() {
        super();
    }
}