package com.awesomeapp.module_3_277

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api277_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api277_42 API"
    }
}