package com.example.picsar.picsar.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.picsar.picsar.data.ApiResource
import com.example.picsar.picsar.domain.PhotosItem
import com.example.picsar.picsar.data.repository.SearchPhotosRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchPicturesVM @Inject constructor(val searchPhotosRepo: SearchPhotosRepo) : ViewModel() {

    var _searchedPhotos = MutableLiveData<List<PhotosItem>?>()
    var searchedPhotos: LiveData<List<PhotosItem>?> = _searchedPhotos

    var _errorMessage = MutableLiveData<String?>()
    var errorMessage: LiveData<String?> = _errorMessage

    fun loadSearchedPhotos(query: String) {
        viewModelScope.launch {
            val searchedPhotosResponse = searchPhotosRepo.searchPhotos(query)
            when (searchedPhotosResponse) {
                is ApiResource.Success -> {
                    _searchedPhotos.postValue(searchedPhotosResponse.value)
                }
                is ApiResource.Loading -> {

                }
                is ApiResource.Error -> {
                    _errorMessage.postValue(searchedPhotosResponse.errorBody)
                }
            }

        }


    }
}