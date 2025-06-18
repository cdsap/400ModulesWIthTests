package com.awesomeapp.module_4_345

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api345_117 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api345_117 API"
    }
}