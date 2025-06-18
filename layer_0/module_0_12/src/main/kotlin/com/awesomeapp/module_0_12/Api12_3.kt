package com.awesomeapp.module_0_12

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api12_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api12_3 API"
    }
}