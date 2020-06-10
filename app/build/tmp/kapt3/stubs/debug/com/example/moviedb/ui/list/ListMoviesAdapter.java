package com.example.moviedb.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003%&\'B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\fH\u0016J\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u001cJ\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0012R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006("}, d2 = {"Lcom/example/moviedb/ui/list/ListMoviesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/moviedb/ui/list/ListMoviesAdapter$ListViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "list", "", "Lcom/example/moviedb/models/Movie;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;Landroidx/fragment/app/Fragment;)V", "lastVisibleItem", "", "listener", "Lcom/example/moviedb/ui/list/ListMoviesAdapter$onItemClickListener;", "loading", "", "onLoadMoreListener", "Lcom/example/moviedb/ui/list/ListMoviesAdapter$OnLoadMoreListener;", "totalItemCount", "getTotalItemCount", "()I", "setTotalItemCount", "(I)V", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setLoad", "setLoaded", "setOnLoadMoreListener", "ListViewHolder", "OnLoadMoreListener", "onItemClickListener", "app_debug"})
public final class ListMoviesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.moviedb.ui.list.ListMoviesAdapter.ListViewHolder> {
    private final com.example.moviedb.ui.list.ListMoviesAdapter.onItemClickListener listener = null;
    private boolean loading;
    private int lastVisibleItem;
    private int totalItemCount;
    private com.example.moviedb.ui.list.ListMoviesAdapter.OnLoadMoreListener onLoadMoreListener;
    private final androidx.fragment.app.FragmentActivity context = null;
    private final java.util.List<com.example.moviedb.models.Movie> list = null;
    
    public final int getTotalItemCount() {
        return 0;
    }
    
    public final void setTotalItemCount(int p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.ui.list.ListMoviesAdapter.ListViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.moviedb.ui.list.ListMoviesAdapter.ListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final void setLoad() {
    }
    
    public final void setOnLoadMoreListener(@org.jetbrains.annotations.NotNull()
    com.example.moviedb.ui.list.ListMoviesAdapter.OnLoadMoreListener onLoadMoreListener) {
    }
    
    public final void setLoaded() {
    }
    
    public ListMoviesAdapter(@org.jetbrains.annotations.Nullable()
    androidx.fragment.app.FragmentActivity context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.moviedb.models.Movie> list, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/example/moviedb/ui/list/ListMoviesAdapter$ListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imagePoster", "Landroid/widget/ImageView;", "layout", "Landroidx/cardview/widget/CardView;", "getLayout", "()Landroidx/cardview/widget/CardView;", "releaseDate", "Landroid/widget/TextView;", "getReleaseDate", "()Landroid/widget/TextView;", "title", "getTitle", "setTitle", "(Landroid/widget/TextView;)V", "voteAverage", "getVoteAverage", "setVoteAverage", "bind", "", "item", "Lcom/example/moviedb/models/Movie;", "app_debug"})
    public static final class ListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.cardview.widget.CardView layout = null;
        private final android.widget.ImageView imagePoster = null;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView voteAverage;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView title;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView releaseDate = null;
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.cardview.widget.CardView getLayout() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getVoteAverage() {
            return null;
        }
        
        public final void setVoteAverage(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getReleaseDate() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.moviedb.models.Movie item) {
        }
        
        public ListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/moviedb/ui/list/ListMoviesAdapter$onItemClickListener;", "", "itemDetail", "", "movieId", "", "app_debug"})
    public static abstract interface onItemClickListener {
        
        public abstract void itemDetail(int movieId);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/moviedb/ui/list/ListMoviesAdapter$OnLoadMoreListener;", "", "onLoadMore", "", "app_debug"})
    public static abstract interface OnLoadMoreListener {
        
        public abstract void onLoadMore();
    }
}