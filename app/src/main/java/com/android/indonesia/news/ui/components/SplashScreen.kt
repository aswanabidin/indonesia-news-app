package com.android.indonesia.news.ui.components

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
@Composable
fun SplashScreen() {
    Image(
        painter = painterResource(id = androidx.core.R.drawable.ic_call_decline_low),
        contentDescription = null
    )
}