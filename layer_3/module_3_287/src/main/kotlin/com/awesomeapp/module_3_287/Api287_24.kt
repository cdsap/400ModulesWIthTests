package com.awesomeapp.module_3_287

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api287_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api287_24 API"
    }
}