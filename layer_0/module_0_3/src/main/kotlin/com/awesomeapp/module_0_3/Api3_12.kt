package com.awesomeapp.module_0_3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api3_12 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api3_12 API"
    }
}