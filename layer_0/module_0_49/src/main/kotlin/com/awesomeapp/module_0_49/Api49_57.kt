package com.awesomeapp.module_0_49

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api49_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api49_57 API"
    }
}