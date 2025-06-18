package com.awesomeapp.module_4_347

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api347_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api347_9 API"
    }
}