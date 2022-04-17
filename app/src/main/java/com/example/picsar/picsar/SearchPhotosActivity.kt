package com.example.picsar.picsar

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.picsar.R
import com.example.picsar.picsar.ui.adapters.SearchPhotosAdapter
import com.example.picsar.picsar.ui.viewmodel.SearchPicturesVM
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_search_photos.*

@AndroidEntryPoint
class SearchPhotosActivity : AppCompatActivity() {
    private lateinit var adapter: SearchPhotosAdapter

    private val searchVm: SearchPicturesVM by viewModels()

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


        searchVm.searchedPhotos.observe(this) {
            if (it.isNullOrEmpty()) {
                tv_search_no_data.visibility = View.VISIBLE
            }
            tv_search_no_data.visibility = View.GONE
            adapter.setData(it!!)
        }

        searchVm.errorMessage.observe(this) { error ->
            error?.let {
                tv_search_no_data.visibility = View.VISIBLE
                tv_search_no_data.text = error
            }
        }

    }


    private fun search(query: String) {
        Log.d("quer", query)
        searchVm.loadSearchedPhotos(query)
    }


    /*private fun search(query: String) {
        Log.d("this is the query", query)
        searchedPhotosVM?.loadSearchedPhotos(query)

        searchedPhotosVM?.searchedPhotosLiveData?.observe(this, {
            if (it is SearchResponse) {
                if (it?.results.isNullOrEmpty()) {
                    tv_search_no_data.visibility = View.VISIBLE
                } else {
                    adapter.setData(it.results!!)
                    tv_search_no_data.visibility = View.GONE
                }


            } else {
                Toast.makeText(
                    this,
                    it.toString(),
                    Toast.LENGTH_SHORT
                ).show()
                Log.d("an error", it.toString())

            }
        })
    }*/
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) finish()
        return super.onOptionsItemSelected(item)
    }
}