package com.example.jetpackcustomer.ui.theme.network

import com.example.jetpackcustomer.utils.CommonResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Url

interface ApiService {
    @POST
    suspend fun getData(
        @Url url: String?,
        @Body data: HashMap<String, Any>
    ): Response<CommonResponse>

}