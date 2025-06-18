package com.awesomeapp.module_3_246

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api246_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api246_18 API"
    }
}