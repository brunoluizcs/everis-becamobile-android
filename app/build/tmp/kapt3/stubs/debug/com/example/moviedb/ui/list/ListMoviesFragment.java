package com.example.moviedb.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u0006\u0010\u0019\u001a\u00020\u0000J\u0012\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\"\u001a\u00020\u0010H\u0016J\u0006\u0010#\u001a\u00020\u0010J\u001a\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/example/moviedb/ui/list/ListMoviesFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/moviedb/ui/list/ListMoviesContract$View;", "Lcom/example/moviedb/ui/list/ListMoviesAdapter$onItemClickListener;", "()V", "adapter", "Lcom/example/moviedb/ui/list/ListMoviesAdapter;", "presenter", "Lcom/example/moviedb/ui/list/ListMoviesContract$Presenter;", "getPresenter", "()Lcom/example/moviedb/ui/list/ListMoviesContract$Presenter;", "setPresenter", "(Lcom/example/moviedb/ui/list/ListMoviesContract$Presenter;)V", "rootView", "Landroid/view/View;", "initView", "", "injectDependency", "itemDetail", "movieId", "", "loadDataSuccess", "list", "", "Lcom/example/moviedb/models/Movie;", "newInstance", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onItemsLoadComplete", "onViewCreated", "view", "showErrorMessage", "error", "", "showProgress", "show", "", "Companion", "app_debug"})
public final class ListMoviesFragment extends androidx.fragment.app.Fragment implements com.example.moviedb.ui.list.ListMoviesContract.View, com.example.moviedb.ui.list.ListMoviesAdapter.onItemClickListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.moviedb.ui.list.ListMoviesContract.Presenter presenter;
    private android.view.View rootView;
    private com.example.moviedb.ui.list.ListMoviesAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "ListMoviesFragment";
    public static final com.example.moviedb.ui.list.ListMoviesFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedb.ui.list.ListMoviesContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.ui.list.ListMoviesContract.Presenter p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void injectDependency() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.moviedb.ui.list.ListMoviesFragment newInstance() {
        return null;
    }
    
    @java.lang.Override()
    public void showProgress(boolean show) {
    }
    
    @java.lang.Override()
    public void showErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void loadDataSuccess(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviedb.models.Movie> list) {
    }
    
    @java.lang.Override()
    public void itemDetail(int movieId) {
    }
    
    private final void initView() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public final void onItemsLoadComplete() {
    }
    
    public ListMoviesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/moviedb/ui/list/ListMoviesFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTAG() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}