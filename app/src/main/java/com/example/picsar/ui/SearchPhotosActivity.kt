package com.example.picsar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.picsar.R
import com.example.picsar.ui.adapters.SearchPhotosAdapter
import com.example.picsar.ui.data.ApiClient
import com.example.picsar.ui.data.model.SearchResponse
import kotlinx.android.synthetic.main.activity_search_photos.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchPhotosActivity : AppCompatActivity() {
    private lateinit var adapter: SearchPhotosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_photos)

        setSupportActionBar(toolbarOne)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = ""

        et_search_all_photos.requestFocus()
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);


        adapter = SearchPhotosAdapter()

        rv_photos_search.layoutManager = GridLayoutManager(this, 2)
        rv_photos_search.adapter = adapter

        et_search_all_photos.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                s?.let {
                    if (it.length > 3) {
                        search(it.toString())
                    } else {
                        adapter.clear()
                    }
                } ?: kotlin.run {
                    adapter.clear()
                }
            }

        })

    }

    private fun search(query: String) {
        var call = ApiClient().service?.getSearchedPhotos(query)
        call?.enqueue(object : Callback<SearchResponse> {
            override fun onResponse(
                call: Call<SearchResponse>,
                response: Response<SearchResponse>
            ) {
                if (response.isSuccessful) {
                    val list = response?.body()?.results
                    if (list.isNullOrEmpty()) {
                        tv_search_no_data.visibility = View.VISIBLE
                    } else {
                        adapter.setData(list)
                        tv_search_no_data.visibility = View.GONE
                    }
                } else {
                    Toast.makeText(
                        this@SearchPhotosActivity,
                        response.errorBody().toString(),
                        Toast.LENGTH_SHORT
                    ).show()
                    Log.d("an error", response.errorBody().toString())
                }
            }

            override fun onFailure(call: Call<SearchResponse>, t: Throwable) {
                Toast.makeText(this@SearchPhotosActivity, t.message, Toast.LENGTH_SHORT).show()
                Log.d(t.message,"on failure")
            }

        })


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home)
            finish()
        return super.onOptionsItemSelected(item)
    }
}