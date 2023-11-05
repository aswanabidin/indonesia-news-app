package com.android.indonesia.news.service.domain.repository

import com.android.indonesia.news.network.Result
import com.android.indonesia.news.service.domain.model.News

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
interface NewsRepository {
    suspend fun getNews(): Result<News>
}