package com.awesomeapp.module_4_396

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api396_19 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api396_19 API"
    }
}