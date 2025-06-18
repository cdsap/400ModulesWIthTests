package com.awesomeapp.module_1_125

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api125_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api125_27 API"
    }
}