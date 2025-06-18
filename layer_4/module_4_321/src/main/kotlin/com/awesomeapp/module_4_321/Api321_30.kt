package com.awesomeapp.module_4_321

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api321_30 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api321_30 API"
    }
}