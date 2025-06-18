package com.awesomeapp.module_0_1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api1_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api1_57 API"
    }
}