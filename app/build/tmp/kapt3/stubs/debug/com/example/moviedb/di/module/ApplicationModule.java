package com.example.moviedb.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/moviedb/di/module/ApplicationModule;", "", "baseApp", "Lcom/example/moviedb/BaseApp;", "(Lcom/example/moviedb/BaseApp;)V", "provideApplication", "Landroid/app/Application;", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    private final com.example.moviedb.BaseApp baseApp = null;
    
    @org.jetbrains.annotations.NotNull()
    @com.example.moviedb.di.scope.PerApplication()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.app.Application provideApplication() {
        return null;
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.BaseApp baseApp) {
        super();
    }
}