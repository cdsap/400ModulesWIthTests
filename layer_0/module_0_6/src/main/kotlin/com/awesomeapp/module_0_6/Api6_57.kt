package com.awesomeapp.module_0_6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api6_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api6_57 API"
    }
}