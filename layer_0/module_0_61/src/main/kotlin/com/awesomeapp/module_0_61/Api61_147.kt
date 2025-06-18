package com.awesomeapp.module_0_61

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api61_147 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api61_147 API"
    }
}