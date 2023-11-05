package com.android.indonesia.news.service.data.entity

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
data class NewsEntity(
    val link: String?,
    val image: String?,
    val description: String?,
    val title: String?,
    val posts: List<PostEntity>?
) {
    data class PostEntity(
        val link: String?,
        val title: String?,
        val pubDate: String?,
        val description: String?,
        val thumbnail: String?
    )
}
