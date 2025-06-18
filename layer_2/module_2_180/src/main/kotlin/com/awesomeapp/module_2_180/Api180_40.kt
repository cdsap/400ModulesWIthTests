package com.awesomeapp.module_2_180

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api180_40 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api180_40 API"
    }
}