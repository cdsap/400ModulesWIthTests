package com.awesomeapp.module_2_186

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api186_180 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api186_180 API"
    }
}