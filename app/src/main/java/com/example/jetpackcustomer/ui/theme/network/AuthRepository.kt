package com.example.jetpackcustomer.ui.theme.network

import com.example.jetpackcustomer.ui.theme.repositiry.BaseRepository
import com.example.jetpackcustomer.utils.CommonResponse
import com.example.jetpackcustomer.utils.Resource
import javax.inject.Inject

class AuthRepository @Inject constructor():BaseRepository() {
    @Inject
      lateinit var apiService:ApiService
    suspend fun callGetUserType(param: HashMap<String, Any>): Resource<CommonResponse> {
        return safeApiCall {
            apiService.getData(EndPoints.GET_COUNTRY, param)
        }
    }
}