package com.awesomeapp.module_3_319

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api319_99 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api319_99 API"
    }
}