package com.awesomeapp.module_0_61

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api61_105 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api61_105 API"
    }
}