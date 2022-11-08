package com.krai29.mvvmlogindemo.data.api.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("id")
    var id : String,
    @SerializedName("code")
    var code : Int,
    @SerializedName("message")
    var message : String,
    @SerializedName("data")
    var data : Data
){
    data class Data(
        @SerializedName("id")
        var id : String,
        @SerializedName("Id")
        var id2 : Int,
        @SerializedName("Name")
        var name : String,
        @SerializedName("Email")
        var email : String,
        @SerializedName("Token")
        var token : String
    )
}


