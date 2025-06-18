package com.awesomeapp.module_3_300

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api300_7 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api300_7 API"
    }
}