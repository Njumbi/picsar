package com.example.picsar.picsar.data.mappers.dtoToDomain

import com.example.picsar.picsar.data.model.SearchDto
import com.example.picsar.picsar.domain.ImageLinks
import com.example.picsar.picsar.domain.PhotosItem
import com.example.picsar.picsar.domain.Search

fun  SearchDto.toDomain()=  this.results?.mapNotNull { it?.toDomain() }


