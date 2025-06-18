package com.awesomeapp.module_3_314

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api314_126 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api314_126 API"
    }
}