package com.awesomeapp.module_1_160

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api160_91 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api160_91 API"
    }
}