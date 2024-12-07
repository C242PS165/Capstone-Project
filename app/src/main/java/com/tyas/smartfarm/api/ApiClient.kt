package com.tyas.smartfarm.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private const val BASE_URL = "https://api-prediction-697742155891.asia-southeast2.run.app/api/"

    val weatherApiService: WeatherApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(WeatherApiService::class.java)
    }

    private const val ARTICLE_BASE_URL = "https://perenual.com/api/"

    val articleApiService: ArticleApiService by lazy {
        Retrofit.Builder()
            .baseUrl(ARTICLE_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ArticleApiService::class.java)
    }
}
