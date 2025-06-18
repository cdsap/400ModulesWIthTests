package com.awesomeapp.module_2_231

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api231_87 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api231_87 API"
    }
}