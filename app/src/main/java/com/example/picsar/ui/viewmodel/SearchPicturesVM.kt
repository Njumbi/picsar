package com.example.picsar.ui.viewmodel

import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.picsar.ui.data.ApiClient
import com.example.picsar.ui.data.model.SearchResponse
import kotlinx.android.synthetic.main.activity_search_photos.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchPicturesVM: ViewModel() {

    var searchedPhotosLiveData = MutableLiveData<Any>()

    fun loadSearchedPhotos(query:String){
        var call = ApiClient().service?.getSearchedPhotos(query)
        call?.enqueue(object : Callback<SearchResponse> {
            override fun onResponse(
                call: Call<SearchResponse>,
                response: Response<SearchResponse>
            ) {
                if (response.isSuccessful) {
                   searchedPhotosLiveData.value = response?.body()

                } else {
                    searchedPhotosLiveData.value = response?.errorBody().toString()
                    println(response.errorBody().toString())
                }
            }

            override fun onFailure(call: Call<SearchResponse>, t: Throwable) {
                searchedPhotosLiveData.value = t.message.toString()
            }

        })


    }
}