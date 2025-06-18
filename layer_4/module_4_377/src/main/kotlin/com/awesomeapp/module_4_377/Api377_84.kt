package com.awesomeapp.module_4_377

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api377_84 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api377_84 API"
    }
}