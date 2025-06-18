package com.awesomeapp.module_0_7

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api7_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api7_57 API"
    }
}