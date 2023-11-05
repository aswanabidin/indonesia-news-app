package com.android.indonesia.news.service.data.remote

import com.android.indonesia.news.network.NetworkResult
import com.android.indonesia.news.service.data.entity.NewsEntity

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
interface NewsRemoteDataSource {

    suspend fun getNews(): NetworkResult<NewsEntity>
}