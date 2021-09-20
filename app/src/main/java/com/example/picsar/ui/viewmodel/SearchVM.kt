package com.example.picsar.ui.viewmodel

import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.picsar.ui.data.ApiClient
import com.example.picsar.ui.data.model.TopicResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchVM:ViewModel() {

    var loadRandomPhotosLiveData = MutableLiveData<Any>()

     fun loadRandomPhotos() {
        var call = ApiClient()?.service?.getTopicPhotos()
        call?.enqueue(object : Callback<TopicResponse> {
            override fun onResponse(
                call: Call<TopicResponse>,
                response: Response<TopicResponse>
            ) {
                if (response.isSuccessful){
                   loadRandomPhotosLiveData.value =response.body()

                }else{
                    loadRandomPhotosLiveData.value = response.errorBody().toString()
                    println(response.errorBody().toString())
                }
            }

            override fun onFailure(call: Call<TopicResponse>, t: Throwable) {
            loadRandomPhotosLiveData.value = t.message.toString()

            }
        })
    }

}