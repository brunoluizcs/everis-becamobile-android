package com.example.moviedb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/example/moviedb/BaseApp;", "Landroid/app/Application;", "()V", "component", "Lcom/example/moviedb/di/component/ApplicationComponent;", "getComponent", "()Lcom/example/moviedb/di/component/ApplicationComponent;", "setComponent", "(Lcom/example/moviedb/di/component/ApplicationComponent;)V", "getApplicationComponent", "onCreate", "", "setup", "Companion", "app_debug"})
public final class BaseApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public com.example.moviedb.di.component.ApplicationComponent component;
    @org.jetbrains.annotations.NotNull()
    private static com.example.moviedb.BaseApp instance;
    public static final com.example.moviedb.BaseApp.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedb.di.component.ApplicationComponent getComponent() {
        return null;
    }
    
    public final void setComponent(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.di.component.ApplicationComponent p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public final void setup() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedb.di.component.ApplicationComponent getApplicationComponent() {
        return null;
    }
    
    public BaseApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/example/moviedb/BaseApp$Companion;", "", "()V", "<set-?>", "Lcom/example/moviedb/BaseApp;", "instance", "getInstance", "()Lcom/example/moviedb/BaseApp;", "setInstance", "(Lcom/example/moviedb/BaseApp;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.moviedb.BaseApp getInstance() {
            return null;
        }
        
        private final void setInstance(com.example.moviedb.BaseApp p0) {
        }
        
        private Companion() {
            super();
        }
    }
}