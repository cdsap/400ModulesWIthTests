package com.awesomeapp.module_4_377

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api377_45 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api377_45 API"
    }
}