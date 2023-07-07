package com.hafizsyahputra.project_uas_hafiz_syahputra.service

import com.hafizsyahputra.project_uas_hafiz_syahputra.model.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=bbf5a3000e95f1dddf266b5e187d4b21")
    fun getTVList(): Call<TVResponse>
}