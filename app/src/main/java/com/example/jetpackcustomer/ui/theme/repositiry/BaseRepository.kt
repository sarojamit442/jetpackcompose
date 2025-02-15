package com.example.jetpackcustomer.ui.theme.repositiry

import com.example.jetpackcustomer.utils.NetworkUtils
import com.example.jetpackcustomer.utils.Resource
import retrofit2.Response
import javax.inject.Inject
// BaseRepository class ., it sereteate of data viewmodel data and business logic
open class BaseRepository @Inject constructor() {

    // Injecting NetworkUtils
    @Inject
    lateinit var networkUtils: NetworkUtils

    suspend fun <T> safeApiCall(apiCall: suspend () -> Response<T>): Resource<T> {
        if (networkUtils.isNetworkAvailable()) {
            try {
                val response = apiCall()
                if (response.isSuccessful) {
                    return Resource.Success(response.body()!!)
                }
                return Resource.Error("Error: ${response.message()}")
            } catch (e: Exception) {
                return Resource.Error("Exception: ${e.localizedMessage}")
            }
        } else {
            return Resource.Error("No internet connection")
        }
    }
}
