package com.awesomeapp.module_0_76

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api76_22 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api76_22 API"
    }
}