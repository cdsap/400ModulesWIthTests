package com.awesomeapp.module_3_266

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api266_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api266_3 API"
    }
}