package com.android.indonesia.news.service.domain.repository

import com.android.indonesia.news.network.NetworkResult
import com.android.indonesia.news.network.Result
import com.android.indonesia.news.service.data.mapper.mapToNews
import com.android.indonesia.news.service.data.remote.NewsRemoteDataSource
import com.android.indonesia.news.service.domain.model.News
import javax.inject.Inject

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
class NewsRepositoryImpl @Inject constructor(
    private val remoteDataSource: NewsRemoteDataSource
) : NewsRepository {

    override suspend fun getNews(): Result<News> {
        return when (val result = remoteDataSource.getNews()) {
            is NetworkResult.Success -> Result.Success(result.value.mapToNews())
            is NetworkResult.Error -> Result.Error(
                errorMessage = result.errorMessage,
                statusCode = result.statusCode
            )
        }
    }
}