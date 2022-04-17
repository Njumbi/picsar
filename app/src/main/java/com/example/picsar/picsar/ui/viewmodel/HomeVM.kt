package com.example.picsar.picsar.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.picsar.picsar.data.ApiResource
import com.example.picsar.picsar.domain.PhotosItem
import com.example.picsar.picsar.data.repository.GetPhotosRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeVM @Inject constructor(val getPhotosRepo: GetPhotosRepo): ViewModel(){

    private val _fetchPhotos = MutableLiveData<List<PhotosItem?>>()
    val fetchPhotos: LiveData<List<PhotosItem?>> get() = _fetchPhotos

    fun getPhotos(){
    viewModelScope.launch {
        val getPhotos = getPhotosRepo.getPhotos()
        when(getPhotos){
            is ApiResource.Success ->{
                _fetchPhotos.postValue(getPhotos.value!!)
            }
            is ApiResource.Loading ->{
            Log.d("----->","Loaading")
            }
            is ApiResource.Error ->{

            }

        }
    }
    }
}