package com.awesomeapp.module_0_15

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api15_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api15_21 API"
    }
}