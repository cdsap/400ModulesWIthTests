package com.awesomeapp.module_2_209

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api209_90 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api209_90 API"
    }
}