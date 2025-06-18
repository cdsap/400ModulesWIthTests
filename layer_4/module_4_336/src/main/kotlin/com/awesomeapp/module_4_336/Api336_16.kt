package com.awesomeapp.module_4_336

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api336_16 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api336_16 API"
    }
}