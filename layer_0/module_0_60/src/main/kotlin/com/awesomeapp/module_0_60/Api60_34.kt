package com.awesomeapp.module_0_60

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api60_34 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api60_34 API"
    }
}