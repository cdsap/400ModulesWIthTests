package com.awesomeapp.module_0_73

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api73_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api73_9 API"
    }
}