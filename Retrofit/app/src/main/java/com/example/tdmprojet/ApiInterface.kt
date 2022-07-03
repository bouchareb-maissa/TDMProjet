package com.example.tdmprojet

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

        @GET("/_search")
        fun getData (
           /* @HeaderMap headers: Map<String?, String?>?,
            @Query("default_operator") operator:String?,
            @Query("q") query:String?,
            @Query("sort") sort: String? ="Dpublication_FR:desc"*/
        ): Call<List<textJItem>>

    }