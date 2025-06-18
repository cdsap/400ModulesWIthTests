package com.awesomeapp.module_3_264

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api264_82 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api264_82 API"
    }
}