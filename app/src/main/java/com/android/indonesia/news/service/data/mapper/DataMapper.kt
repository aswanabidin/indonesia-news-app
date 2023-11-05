package com.android.indonesia.news.service.data.mapper

import com.android.indonesia.news.service.data.entity.NewsEntity
import com.android.indonesia.news.service.domain.model.News

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
fun NewsEntity.mapToNews(): News {
    return News(
        link = link.orEmpty(),
        image = image.orEmpty(),
        description = description.orEmpty(),
        title = title.orEmpty(),
        posts = posts?.map { it.mapToPost() } ?: emptyList()
    )
}

fun NewsEntity.PostEntity.mapToPost(): News.Post {
    return News.Post(
        link = link.orEmpty(),
        title = title.orEmpty(),
        pubDate = pubDate.orEmpty(),
        description = description.orEmpty(),
        thumbnail = thumbnail.orEmpty()
    )
}