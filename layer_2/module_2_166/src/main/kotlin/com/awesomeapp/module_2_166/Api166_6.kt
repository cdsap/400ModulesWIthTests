package com.awesomeapp.module_2_166

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api166_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api166_6 API"
    }
}