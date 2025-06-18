package com.awesomeapp.module_0_42

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api42_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api42_21 API"
    }
}