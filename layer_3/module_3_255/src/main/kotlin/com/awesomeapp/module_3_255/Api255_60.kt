package com.awesomeapp.module_3_255

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api255_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api255_60 API"
    }
}