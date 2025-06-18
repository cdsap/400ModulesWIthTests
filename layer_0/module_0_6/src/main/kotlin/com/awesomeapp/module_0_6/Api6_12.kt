package com.awesomeapp.module_0_6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api6_12 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api6_12 API"
    }
}