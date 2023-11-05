package com.android.indonesia.news.service.data.remote

import com.android.indonesia.news.network.NetworkResult
import com.android.indonesia.news.network.toNetworkResult
import com.android.indonesia.news.service.NewsService
import com.android.indonesia.news.service.data.entity.NewsEntity
import javax.inject.Inject

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
class NewsRemoteDataSourceImpl @Inject constructor(
    private val newsService: NewsService
) : NewsRemoteDataSource {

    override suspend fun getNews(): NetworkResult<NewsEntity> {
        return newsService.getNews().toNetworkResult()
    }
}