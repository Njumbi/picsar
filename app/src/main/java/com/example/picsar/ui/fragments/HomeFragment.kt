package com.example.picsar.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.picsar.R
import com.example.picsar.ui.adapters.HomeAdapter
import com.example.picsar.ui.data.ApiClient
import com.example.picsar.ui.data.ApiService
import com.example.picsar.ui.data.model.PhotosResponse
import com.example.picsar.ui.data.model.PhotosResponseItem
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeFragment: Fragment() {
private lateinit var adapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter= HomeAdapter()
        rv_photos.layoutManager = LinearLayoutManager(requireActivity(),LinearLayoutManager.VERTICAL,false)
        rv_photos.adapter = adapter

        funLoadPhotos()

    }

    private fun funLoadPhotos() {
      var call = ApiClient()?.service?.getPhotos()
        call?.enqueue(object : Callback<PhotosResponse>{
            override fun onResponse(
                call: Call<PhotosResponse>,
                response: Response<PhotosResponse>
            ) {
                if (response.isSuccessful){
                    val list = response?.body()
                    adapter.setData(list as List<PhotosResponseItem>)

                }else{
                    Toast.makeText(requireActivity(), response.errorBody().toString(), Toast.LENGTH_SHORT).show()
                    println(response.errorBody().toString())
                }
            }

            override fun onFailure(call: Call<PhotosResponse>, t: Throwable) {
                Toast.makeText(requireActivity(), t.message, Toast.LENGTH_SHORT).show()
                println("this is on failure")
                println(t.message)

            }
        })
    }
}