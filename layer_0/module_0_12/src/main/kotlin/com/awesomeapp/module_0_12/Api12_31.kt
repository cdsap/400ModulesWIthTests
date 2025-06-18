package com.awesomeapp.module_0_12

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api12_31 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api12_31 API"
    }
}