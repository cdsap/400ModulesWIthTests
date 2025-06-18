package com.awesomeapp.module_0_40

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api40_28 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api40_28 API"
    }
}