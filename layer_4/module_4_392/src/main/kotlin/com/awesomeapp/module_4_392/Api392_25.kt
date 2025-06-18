package com.awesomeapp.module_4_392

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api392_25 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api392_25 API"
    }
}