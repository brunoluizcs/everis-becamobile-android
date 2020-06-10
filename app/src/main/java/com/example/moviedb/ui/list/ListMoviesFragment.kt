package com.example.moviedb.ui.list


import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.moviedb.R
import com.example.moviedb.di.component.DaggerFragmentComponent
import com.example.moviedb.di.module.FragmentModule
import com.example.moviedb.models.Movie
import com.example.moviedb.ui.detail.DetailMovieActivity
import com.example.moviedb.util.Helpers
import kotlinx.android.synthetic.main.fragment_list_movies.*
import javax.inject.Inject

class ListMoviesFragment : Fragment(), ListMoviesContract.View, ListMoviesAdapter.onItemClickListener {

    @Inject
    lateinit var presenter: ListMoviesContract.Presenter

    private lateinit var rootView: View
    private lateinit var adapter: ListMoviesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependency()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_list_movies, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.attach(this)
        presenter.subscribe()

        swipeRefreshLayout.setOnRefreshListener {
            presenter.loadData(10)
        }

        initView()
    }

    private fun injectDependency() {
        val listComponent = DaggerFragmentComponent.builder()
            .fragmentModule(FragmentModule())
            .build()

        listComponent.inject(this)
    }

    fun newInstance(): ListMoviesFragment {
        return ListMoviesFragment()
    }

    override fun showProgress(show: Boolean) {
        if (show) {
            progressBar.visibility = View.VISIBLE
        } else {
            progressBar.visibility = View.GONE
        }
    }

    override fun showErrorMessage(error: String) {
        Log.e("Error", error)
    }

    override fun loadDataSuccess(list: List<Movie>) {
        adapter = ListMoviesAdapter(activity, list.toMutableList(), this)
        val linearLayoutManager = LinearLayoutManager(activity)
        recyclerView!!.layoutManager = linearLayoutManager
        recyclerView!!.adapter = adapter

        onItemsLoadComplete()
    }

    override fun itemDetail(movieId: Int) {
        val intent = Intent(activity, DetailMovieActivity::class.java)
        intent.putExtra("movie_id", movieId)
        activity?.startActivity(intent)
    }

    private fun initView() {
        presenter.loadData(10)

        //https://www.journaldev.com/24041/android-recyclerview-load-more-endless-scrolling

        /*recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val layoutManager = LinearLayoutManager::class.java.cast(recyclerView.layoutManager)
                val totalItemCount = layoutManager!!.itemCount
                val lastVisible = layoutManager.findLastVisibleItemPosition()

                val endHasBeenReached = lastVisible + 5 >= totalItemCount
                if (totalItemCount > 0 && endHasBeenReached) {
                    presenter.loadData(totalItemCount + 10)
                }
            }
        })*/
    }

    override fun onDestroyView() {
        super.onDestroyView()
        presenter.unsubscribe()
    }

    fun onItemsLoadComplete() {
        if (swipeRefreshLayout.isRefreshing) {
            adapter.notifyDataSetChanged()
            swipeRefreshLayout.isRefreshing = false
        }
    }

    companion object {
        val TAG: String = "ListMoviesFragment"
    }
}
