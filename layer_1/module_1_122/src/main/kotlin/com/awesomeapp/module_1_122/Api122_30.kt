package com.awesomeapp.module_1_122

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api122_30 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api122_30 API"
    }
}