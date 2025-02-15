package com.example.jetpackcustomer.utils

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CommonResponse(
    @SerializedName("error")
    @Expose
    var error: Boolean = true,

    @SerializedName("error_code")
    @Expose
    var errorCode: Int = 3001890,

    @SerializedName("fynoo_id")
    @Expose
    var fynooId: String = "Fynoo Id",

    @SerializedName("mail_status")
    @Expose
    var mailStatus: String = "mail status",

    @SerializedName("error_description")
    @Expose
    var errorDescription: String = "My Custom Error",

    @SerializedName("data")
    @Expose
    var data: Any? = null,

//    @SerializedName("authentication")
//    @Expose
//    var authentication: Authentication? = null,

    @SerializedName("otp_time")
    @Expose
    var otpTime: String? = null

):Serializable
