package com.awesomeapp.module_3_281

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api281_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api281_57 API"
    }
}