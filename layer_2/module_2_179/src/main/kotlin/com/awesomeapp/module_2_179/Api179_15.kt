package com.awesomeapp.module_2_179

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api179_15 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api179_15 API"
    }
}