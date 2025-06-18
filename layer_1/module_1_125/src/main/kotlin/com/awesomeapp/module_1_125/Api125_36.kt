package com.awesomeapp.module_1_125

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api125_36 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api125_36 API"
    }
}