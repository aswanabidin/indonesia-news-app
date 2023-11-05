package com.android.indonesia.news.network

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
sealed class NetworkResult<out T : Any> {

    data class Success<T : Any>(val value: T) : NetworkResult<T>()

    data class Error(
        val errorMessage: String,
        val statusCode: Int,
        val httpCode: Int
    ) : NetworkResult<Nothing>()
}
