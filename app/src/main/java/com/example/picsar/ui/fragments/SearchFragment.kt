package com.example.picsar.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.picsar.R
import com.example.picsar.ui.SearchPhotosActivity
import com.example.picsar.ui.adapters.SearchAdapter
import com.example.picsar.ui.data.ApiClient
import com.example.picsar.ui.data.model.TopicResponse
import kotlinx.android.synthetic.main.search_fragment.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchFragment :Fragment() {
    private lateinit var adapter : SearchAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.search_fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = SearchAdapter()
        rv_random_photos.layoutManager = StaggeredGridLayoutManager(2,LinearLayoutManager.VERTICAL)
        rv_random_photos.adapter = adapter
         loadRandomPhotos()

        et_search.setOnClickListener{
            val intent = Intent(activity,SearchPhotosActivity::class.java)
            startActivity(intent)
        }


    }


    private fun loadRandomPhotos() {
        var call = ApiClient()?.service?.getTopicPhotos()
        call?.enqueue(object : Callback<TopicResponse>{
            override fun onResponse(
                call: Call<TopicResponse>,
                response: Response<TopicResponse>
            ) {
                if (response.isSuccessful){
                    val list = response?.body()
                    adapter.setData(list !!)

                }else{
                    Toast.makeText(requireActivity(), response.errorBody().toString(), Toast.LENGTH_SHORT).show()
                    println(response.errorBody().toString())
                }
            }

            override fun onFailure(call: Call<TopicResponse>, t: Throwable) {
                Toast.makeText(requireActivity(), t.message, Toast.LENGTH_SHORT).show()
                println("this is on failure")
                println(t.message)

            }
        })
    }
}