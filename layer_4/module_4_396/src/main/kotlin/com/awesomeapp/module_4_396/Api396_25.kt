package com.awesomeapp.module_4_396

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api396_25 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api396_25 API"
    }
}