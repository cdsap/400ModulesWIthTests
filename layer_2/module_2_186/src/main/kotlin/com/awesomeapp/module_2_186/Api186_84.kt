package com.awesomeapp.module_2_186

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api186_84 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api186_84 API"
    }
}