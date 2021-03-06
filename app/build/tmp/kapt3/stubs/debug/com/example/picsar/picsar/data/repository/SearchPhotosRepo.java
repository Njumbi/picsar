package com.example.picsar.picsar.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/picsar/picsar/data/repository/SearchPhotosRepo;", "", "searchPhotos", "Lcom/example/picsar/picsar/data/ApiResource;", "", "Lcom/example/picsar/picsar/domain/PhotosItem;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface SearchPhotosRepo {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchPhotos(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.picsar.picsar.data.ApiResource<? extends java.util.List<com.example.picsar.picsar.domain.PhotosItem>>> continuation);
}