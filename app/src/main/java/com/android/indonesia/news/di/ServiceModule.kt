package com.android.indonesia.news.di

import com.android.indonesia.news.service.data.remote.NewsRemoteDataSource
import com.android.indonesia.news.service.data.remote.NewsRemoteDataSourceImpl
import com.android.indonesia.news.service.domain.repository.NewsRepository
import com.android.indonesia.news.service.domain.repository.NewsRepositoryImpl
import dagger.Module
import dagger.Provides

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
@Module
class ServiceModule {

    @Provides
    fun provideNewsRemoteDataSource(
        remoteDataSourceImpl: NewsRemoteDataSourceImpl
    ): NewsRemoteDataSource {
        return remoteDataSourceImpl
    }

    @Provides
    fun provideNewsRepository(
        repositoryImpl: NewsRepositoryImpl
    ): NewsRepository {
        return repositoryImpl
    }
}