package com.example.picsar.picsar.di

import com.example.picsar.BuildConfig
import com.example.picsar.picsar.BASE_URL
import com.example.picsar.picsar.data.ApiService
import com.example.picsar.picsar.data.repository.*
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    @Singleton
    fun providesOkhttp(): OkHttpClient {
        val okhhtp = OkHttpClient.Builder()

        if (BuildConfig.DEBUG) {
            val logger = HttpLoggingInterceptor()
            logger.setLevel(HttpLoggingInterceptor.Level.BODY)

            okhhtp.addInterceptor(logger)
        }
        return okhhtp.build()
    }

    @Provides
    @Singleton
    fun providesRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit
        .Builder()
        .addConverterFactory(
            GsonConverterFactory
                .create()
        )
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .client(okHttpClient)
        .baseUrl(BASE_URL).build()

    @Provides
    @Singleton
    fun apiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun providesPhotosRepo(apiService: ApiService): GetPhotosRepo = GetPhotosRepoImpl(apiService)

    @Provides
    @Singleton
    fun providesGetTopicPhotos(apiService: ApiService): GetTopicPhotosRepo =
        GetTopicPhotosRepoImpl(apiService)

    @Provides
    @Singleton
    fun providesSearchPhotosRepo(apiService: ApiService): SearchPhotosRepo =
        SearchPhotosRepoImpl(apiService)

}