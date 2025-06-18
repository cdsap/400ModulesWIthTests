package com.awesomeapp.module_0_41

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api41_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api41_9 API"
    }
}