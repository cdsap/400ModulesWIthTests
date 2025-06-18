package com.awesomeapp.module_4_377

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api377_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api377_18 API"
    }
}