package com.android.indonesia.news.ui.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.indonesia.news.ui.theme.AppTheme

/**
 * Created by Muhammad Aswan Abidin on 05/11/2023
 * Copyright (c) 2023 Indonesia News. All rights reserved.
 **/
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Android")
    }
}