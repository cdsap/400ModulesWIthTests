package com.awesomeapp.module_3_317

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api317_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api317_51 API"
    }
}