package com.awesomeapp.module_3_320

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api320_19 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api320_19 API"
    }
}