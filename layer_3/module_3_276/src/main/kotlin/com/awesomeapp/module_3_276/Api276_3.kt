package com.awesomeapp.module_3_276

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api276_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api276_3 API"
    }
}