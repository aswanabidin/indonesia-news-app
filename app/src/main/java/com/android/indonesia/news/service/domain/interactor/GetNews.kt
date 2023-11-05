package com.android.indonesia.news.service.domain.interactor

import com.android.indonesia.news.common.UseCase
import com.android.indonesia.news.network.Result
import com.android.indonesia.news.service.domain.model.News
import com.android.indonesia.news.service.domain.repository.NewsRepository
import javax.inject.Inject

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
class GetNews @Inject constructor(
    private val repository: NewsRepository
) : UseCase<News, Unit>() {

    override suspend fun build(params: Unit?): Result<News> {
        return repository.getNews()
    }
}