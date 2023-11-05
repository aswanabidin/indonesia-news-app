package com.android.indonesia.news.common

import com.android.indonesia.news.network.Result

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
abstract class BaseUseCase<ResultType : Any, in Params> {
    abstract suspend fun build(params: Params?): ResultType
    open suspend operator fun invoke(params: Params? = null): ResultType {
        return build(params)
    }
}

abstract class UseCase<SuccessType : Any, in Params> : BaseUseCase<Result<SuccessType>, Params>() {
    private suspend fun execute(params: Params? = null): Result<SuccessType> {
        return try {
            build(params)
        } catch (error: Throwable) {
            Result.Error("Terjadi kesalahan.", 0)
        }
    }

    override suspend operator fun invoke(params: Params?): Result<SuccessType> {
        return execute(params)
    }
}