package com.example.picsar.picsar.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001b\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/picsar/picsar/data/ApiService;", "", "getPhotos", "", "Lcom/example/picsar/picsar/data/model/PhotosDtoItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSearchedPhotos", "Lcom/example/picsar/picsar/data/model/SearchDto;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopicPhotos", "Lcom/example/picsar/picsar/data/model/TopicDtoItem;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "photos/?client_id=AA7Ffs8b_7EI29zU4fkM_YmV9WLkvhfH-8APEY5BK4o&page=10")
    public abstract java.lang.Object getPhotos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.picsar.picsar.data.model.PhotosDtoItem>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/photos?client_id=AA7Ffs8b_7EI29zU4fkM_YmV9WLkvhfH-8APEY5BK4o&page=3")
    public abstract java.lang.Object getSearchedPhotos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.picsar.picsar.data.model.SearchDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "topics?client_id=AA7Ffs8b_7EI29zU4fkM_YmV9WLkvhfH-8APEY5BK4o")
    public abstract java.lang.Object getTopicPhotos(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.picsar.picsar.data.model.TopicDtoItem>> continuation);
}