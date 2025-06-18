package com.awesomeapp.module_3_279

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api279_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api279_57 API"
    }
}