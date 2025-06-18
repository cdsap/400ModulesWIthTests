package com.awesomeapp.module_2_180

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api180_28 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api180_28 API"
    }
}