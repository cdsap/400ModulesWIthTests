package com.awesomeapp.module_4_334

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api334_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api334_6 API"
    }
}