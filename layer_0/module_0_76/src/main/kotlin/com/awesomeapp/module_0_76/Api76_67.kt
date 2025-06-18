package com.awesomeapp.module_0_76

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api76_67 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api76_67 API"
    }
}