package com.awesomeapp.module_3_314

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api314_120 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api314_120 API"
    }
}