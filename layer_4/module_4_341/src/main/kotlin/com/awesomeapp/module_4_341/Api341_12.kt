package com.awesomeapp.module_4_341

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api341_12 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api341_12 API"
    }
}