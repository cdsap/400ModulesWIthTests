package com.awesomeapp.module_2_179

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api179_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api179_24 API"
    }
}