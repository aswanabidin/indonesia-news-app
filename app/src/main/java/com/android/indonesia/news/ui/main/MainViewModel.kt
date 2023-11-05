package com.android.indonesia.news.ui.main

import androidx.lifecycle.ViewModel
import com.android.indonesia.news.service.domain.interactor.GetNews
import javax.inject.Inject

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
class MainViewModel @Inject constructor(
    private val getNews: GetNews
) : ViewModel() {


}