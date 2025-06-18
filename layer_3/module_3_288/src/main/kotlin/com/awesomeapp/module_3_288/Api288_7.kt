package com.awesomeapp.module_3_288

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api288_7 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api288_7 API"
    }
}