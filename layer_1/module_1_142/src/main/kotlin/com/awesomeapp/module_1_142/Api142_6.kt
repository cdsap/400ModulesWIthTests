package com.awesomeapp.module_1_142

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api142_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api142_6 API"
    }
}