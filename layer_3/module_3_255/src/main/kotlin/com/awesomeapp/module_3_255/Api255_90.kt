package com.awesomeapp.module_3_255

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api255_90 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api255_90 API"
    }
}