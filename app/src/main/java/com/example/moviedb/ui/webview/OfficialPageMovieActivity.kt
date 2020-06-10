package com.example.moviedb.ui.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.moviedb.R
import kotlinx.android.synthetic.main.activity_official_page_movie.*

class OfficialPageMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_official_page_movie)

        loadHomePage()

        swipeRefreshLayout.setOnRefreshListener {
            loadHomePage()
        }
    }

    private fun loadHomePage() {
        val webSettings = webview.settings
        webSettings.javaScriptEnabled = true
        webview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }

        val link = intent?.getStringExtra("link")

        webview!!.loadUrl(link)

        if (swipeRefreshLayout.isRefreshing)
            swipeRefreshLayout.isRefreshing = false
    }
}
