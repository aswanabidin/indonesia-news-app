package com.android.indonesia.news.network

import retrofit2.Response

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/

fun <T : Any> Response<T>.toNetworkResult(): NetworkResult<T> {
    val entity = body()

    return if (isSuccessful && entity != null) {
        NetworkResult.Success(entity)
    } else {
        NetworkResult.Error("Terjadi kesalahan. Silakan coba lagi.", 1001, code())
    }
}