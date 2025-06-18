package com.awesomeapp.module_4_321

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api321_99 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api321_99 API"
    }
}