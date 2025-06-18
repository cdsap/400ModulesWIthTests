package com.awesomeapp.module_1_125

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api125_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api125_21 API"
    }
}