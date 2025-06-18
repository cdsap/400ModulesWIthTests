package com.awesomeapp.module_3_283

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api283_78 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api283_78 API"
    }
}