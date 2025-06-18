package com.awesomeapp.module_2_172

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api172_25 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api172_25 API"
    }
}