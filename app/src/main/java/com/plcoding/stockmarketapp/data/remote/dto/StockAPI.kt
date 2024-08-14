package com.plcoding.stockmarketapp.data.remote.dto

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockAPI {

    @GET("query?function=LISTING_STATUS")
    suspend fun getListings(
        @Query("apikey")apikey: String
    ): ResponseBody

    companion object{
        const val API_KEY = "J2DO3ZHQ4SL1YE3J"
        const val BASE_URL = "https://alphavantage.co"
    }
}