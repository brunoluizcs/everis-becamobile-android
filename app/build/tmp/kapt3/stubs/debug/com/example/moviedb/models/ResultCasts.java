package com.example.moviedb.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/moviedb/models/ResultCasts;", "", "()V", "cast", "", "Lcom/example/moviedb/models/Cast;", "getCast", "()Ljava/util/List;", "setCast", "(Ljava/util/List;)V", "id", "", "getId", "()I", "setId", "(I)V", "app_debug"})
public final class ResultCasts {
    @com.google.gson.annotations.SerializedName(value = "id")
    private int id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "cast")
    public java.util.List<com.example.moviedb.models.Cast> cast;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.moviedb.models.Cast> getCast() {
        return null;
    }
    
    public final void setCast(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviedb.models.Cast> p0) {
    }
    
    public ResultCasts() {
        super();
    }
}