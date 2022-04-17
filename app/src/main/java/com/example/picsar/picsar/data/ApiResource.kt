package com.example.picsar.picsar.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


sealed class ApiResource<out T> {
    data class Success<out T>(val value: T) : ApiResource<T>()
    data class Error(
        val isNetworkError: Boolean?,
        val errorCode: Int?,
        val errorBody: String?
    ) : ApiResource<Nothing>()

    object Loading : ApiResource<Nothing>()

}

suspend fun <T : Any> safeApiCall(
    apiCall: suspend () -> T,
): ApiResource<T> {
    return withContext(Dispatchers.IO) {
        try {
            val response = apiCall.invoke()
            ApiResource.Success(response)
        } catch (throwable: Throwable) {
            when (throwable) {
                is com.bumptech.glide.load.HttpException -> {
                    ApiResource.Error(false, throwable.statusCode, throwable.message)
                }
                else -> {
                    ApiResource.Error(true, null, throwable.message)
                }
            }
        }
    }
}
