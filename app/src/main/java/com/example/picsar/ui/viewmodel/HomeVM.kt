package com.example.picsar.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.picsar.ui.data.ApiClient
import com.example.picsar.ui.data.model.PhotosResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeVM : ViewModel() {

    var loadPhotosLiveData = MutableLiveData<Any>()

    fun funLoadPhotos() {
        var call = ApiClient()?.service?.getPhotos()
        call?.enqueue(object : Callback<PhotosResponse> {
            override fun onResponse(
                call: Call<PhotosResponse>,
                response: Response<PhotosResponse>
            ) {
                if (response.isSuccessful) {
                    loadPhotosLiveData.value = response.body()
                } else {
                    loadPhotosLiveData.value = response.errorBody().toString()
                    println(response.errorBody().toString())
                }
            }

            override fun onFailure(call: Call<PhotosResponse>, t: Throwable) {
                loadPhotosLiveData.value = t.message.toString()
            }
        })
    }

}