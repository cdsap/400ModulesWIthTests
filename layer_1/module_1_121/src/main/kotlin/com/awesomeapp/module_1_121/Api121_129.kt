package com.awesomeapp.module_1_121

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api121_129 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api121_129 API"
    }
}