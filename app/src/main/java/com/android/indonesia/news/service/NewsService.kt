package com.android.indonesia.news.service

import com.android.indonesia.news.service.data.entity.NewsEntity
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
interface NewsService {

    @GET("antara/tekno")
    suspend fun getNews(): Response<NewsEntity>
}