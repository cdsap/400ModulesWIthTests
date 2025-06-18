package com.awesomeapp.module_2_231

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api231_99 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api231_99 API"
    }
}