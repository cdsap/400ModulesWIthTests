package com.awesomeapp.module_1_135

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api135_81 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api135_81 API"
    }
}