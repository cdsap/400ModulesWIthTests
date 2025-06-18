package com.awesomeapp.module_0_45

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api45_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api45_9 API"
    }
}