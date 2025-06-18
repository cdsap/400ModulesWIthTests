package com.awesomeapp.module_3_268

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api268_34 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api268_34 API"
    }
}