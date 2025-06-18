package com.awesomeapp.module_0_60

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api60_19 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api60_19 API"
    }
}