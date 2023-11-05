package com.android.indonesia.news.di

import com.android.indonesia.news.service.domain.interactor.GetNews
import com.android.indonesia.news.ui.main.MainActivity
import com.android.indonesia.news.ui.splash.SplashActivity
import dagger.Component

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
@Component(
    modules = [
        AppModule::class,
        NetworkModule::class,
        ServiceModule::class
    ]
)
interface AppComponent {
    fun getNews(): GetNews

    fun inject(activity: SplashActivity)
    fun inject(activity: MainActivity)
}