package com.awesomeapp.module_2_223

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api223_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api223_18 API"
    }
}