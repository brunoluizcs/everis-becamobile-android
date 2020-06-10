package com.example.moviedb.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.moviedb.R
import com.example.moviedb.models.Movie
import com.example.moviedb.util.Constants
import com.example.moviedb.util.Helpers
import com.squareup.picasso.Picasso
import com.example.moviedb.ui.list.ListMoviesAdapter.OnLoadMoreListener

class ListMoviesAdapter(private val context: FragmentActivity?, private val list: MutableList<Movie>,
                        fragment: Fragment): RecyclerView.Adapter<ListMoviesAdapter.ListViewHolder>() {

    private val listener: onItemClickListener
    private var loading: Boolean = false
    private var lastVisibleItem: Int = 0
    var totalItemCount: Int = 0
    private var onLoadMoreListener: OnLoadMoreListener? = null

    //infinity scroll
    //https://inducesmile.com/android/android-recyclerview-infinite-scroll-tutorial/
    init {
        this.listener = fragment as onItemClickListener
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val movie = list[position]

        holder.bind(movie)
        holder.title.text = movie.title
        holder.voteAverage.text = movie.voteAvegare.toString()

        holder.layout.setOnClickListener {
            listener.itemDetail(movie.id)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ListViewHolder(itemView)
    }

    class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val layout: CardView = itemView.findViewById(R.id.cv)
        private val imagePoster: ImageView = itemView.findViewById(R.id.poster_path)
        var voteAverage: TextView = itemView.findViewById(R.id.vote_average)
        var title: TextView = itemView.findViewById(R.id.title)
        val releaseDate: TextView = itemView.findViewById(R.id.release_date)

        fun bind(item: Movie) {
            voteAverage.text = item.voteAvegare.toString()
            title.text = item.title
            Picasso.get().load(Constants.BASE_URL_IMAGE_185 + item.posterPath).into(imagePoster)
            releaseDate.text = item.releaseDate?.let { Helpers.formatDate(it) }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return 1
    }

    interface onItemClickListener {
        fun itemDetail(movieId : Int)
    }

    fun setLoad() {
        loading = false
    }

    fun setOnLoadMoreListener(onLoadMoreListener: OnLoadMoreListener) {
        this.onLoadMoreListener = onLoadMoreListener
    }

    interface OnLoadMoreListener {
        fun onLoadMore()
    }

    fun setLoaded() {
        loading = false
    }
}