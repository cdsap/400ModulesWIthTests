package com.awesomeapp.module_3_268

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api268_46 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api268_46 API"
    }
}