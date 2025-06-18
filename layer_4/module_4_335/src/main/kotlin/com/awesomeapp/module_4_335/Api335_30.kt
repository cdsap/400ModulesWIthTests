package com.awesomeapp.module_4_335

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api335_30 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api335_30 API"
    }
}