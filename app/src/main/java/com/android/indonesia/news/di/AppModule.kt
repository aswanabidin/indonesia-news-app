package com.android.indonesia.news.di

import android.content.Context
import androidx.lifecycle.ViewModel
import com.android.indonesia.news.ui.main.MainViewModel
import com.android.indonesia.news.ui.splash.SplashViewModel
import dagger.Module
import dagger.Provides

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
@Module
class AppModule(private val context: Context) {

    @Provides
    fun provideContext(): Context = context

    @Provides
    fun provideSplashViewModel(viewModel: SplashViewModel): ViewModel = viewModel

    @Provides
    fun provideMainViewModel(viewModel: MainViewModel): ViewModel = viewModel
}