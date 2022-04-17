package com.example.picsar.picsar.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.picsar.picsar.data.ApiResource
import com.example.picsar.picsar.domain.TopicItem
import com.example.picsar.picsar.data.repository.GetTopicPhotosRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchVM @Inject constructor(val getTopicPhotosRepo: GetTopicPhotosRepo) : ViewModel() {

    private var _loadRandomPhotos = MutableLiveData<List<TopicItem>>()
    var loadRandomPhotos: LiveData<List<TopicItem>> = _loadRandomPhotos

 fun loadPhotos() {
        viewModelScope.launch {
            var loadPhotos = getTopicPhotosRepo.getTopicPhotos()
            when (loadPhotos) {
                is ApiResource.Success -> {
                    _loadRandomPhotos.postValue(loadPhotos.value!!)
                }
                is ApiResource.Loading -> {

                }
                is ApiResource.Error -> {

                }
            }

        }

    }


}