package com.awesomeapp.module_0_17

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api17_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api17_3 API"
    }
}