package com.example.picsar.picsar.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.picsar.R
import com.example.picsar.picsar.SearchPhotosActivity
import com.example.picsar.picsar.ui.adapters.SearchAdapter
import com.example.picsar.picsar.ui.viewmodel.SearchVM
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.search_fragment.*

@AndroidEntryPoint
class SearchFragment : Fragment() {
    private lateinit var adapter: SearchAdapter
    private val searchVM: SearchVM by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.search_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = SearchAdapter()
        rv_random_photos.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        rv_random_photos.adapter = adapter

        searchVM.loadPhotos()
        searchVM.loadRandomPhotos.observe(viewLifecycleOwner) {
            adapter.setData(it)
            Log.d("---->",it.toString())
        }
//        loadRandomPhotos()

        et_search.setOnClickListener {
            val intent = Intent(activity, SearchPhotosActivity::class.java)
            startActivity(intent)
        }
    }


//    private fun loadRandomPhotos() {
//
//    }
}