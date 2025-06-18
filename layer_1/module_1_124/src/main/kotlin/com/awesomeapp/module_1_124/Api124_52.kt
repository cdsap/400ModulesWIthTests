package com.awesomeapp.module_1_124

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api124_52 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api124_52 API"
    }
}