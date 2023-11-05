package com.android.indonesia.news.di

import com.android.indonesia.news.service.NewsService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
@Module
class NetworkModule {

    companion object {
        private const val NEWS_BASE_URL = "https://api-berita-indonesia.vercel.app"
    }

    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(NEWS_BASE_URL)
            .build()
    }

    @Provides
    fun provideNewsService(retrofit: Retrofit): NewsService {
        return retrofit.create(NewsService::class.java)
    }
}