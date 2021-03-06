package com.example.picsar.picsar.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/picsar/picsar/di/AppModule;", "", "()V", "apiService", "Lcom/example/picsar/picsar/data/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "providesGetTopicPhotos", "Lcom/example/picsar/picsar/data/repository/GetTopicPhotosRepo;", "providesOkhttp", "Lokhttp3/OkHttpClient;", "providesPhotosRepo", "Lcom/example/picsar/picsar/data/repository/GetPhotosRepo;", "providesRetrofit", "okHttpClient", "providesSearchPhotosRepo", "Lcom/example/picsar/picsar/data/repository/SearchPhotosRepo;", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.picsar.picsar.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient providesOkhttp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit providesRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.picsar.picsar.data.ApiService apiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.picsar.picsar.data.repository.GetPhotosRepo providesPhotosRepo(@org.jetbrains.annotations.NotNull()
    com.example.picsar.picsar.data.ApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.picsar.picsar.data.repository.GetTopicPhotosRepo providesGetTopicPhotos(@org.jetbrains.annotations.NotNull()
    com.example.picsar.picsar.data.ApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.picsar.picsar.data.repository.SearchPhotosRepo providesSearchPhotosRepo(@org.jetbrains.annotations.NotNull()
    com.example.picsar.picsar.data.ApiService apiService) {
        return null;
    }
}