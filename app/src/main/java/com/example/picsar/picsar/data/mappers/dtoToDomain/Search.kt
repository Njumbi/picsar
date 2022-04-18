package com.example.picsar.picsar.data.mappers.dtoToDomain

import com.example.picsar.picsar.data.model.SearchDto

fun SearchDto.toDomain() = this.results?.mapNotNull { it?.toDomain() }


