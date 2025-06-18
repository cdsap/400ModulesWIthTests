package com.awesomeapp.module_2_217

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api217_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api217_66 API"
    }
}