package com.example.consumerdbzplanet

import com.example.consumerdbzplanet.models.PlanetResponse
import retrofit2.Response
import retrofit2.http.GET

interface DbzApi {
    @GET("planets")
    suspend fun getPlanetas() : Response<PlanetResponse>
}