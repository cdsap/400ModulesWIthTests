package com.awesomeapp.module_3_300

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api300_28 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api300_28 API"
    }
}