package com.awesomeapp.module_3_266

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api266_69 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api266_69 API"
    }
}