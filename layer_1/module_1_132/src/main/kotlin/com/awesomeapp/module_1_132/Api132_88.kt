package com.awesomeapp.module_1_132

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api132_88 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api132_88 API"
    }
}