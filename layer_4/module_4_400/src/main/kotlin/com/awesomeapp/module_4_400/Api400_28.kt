package com.awesomeapp.module_4_400

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api400_28 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api400_28 API"
    }
}