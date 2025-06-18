package com.awesomeapp.module_1_87

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api87_15 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api87_15 API"
    }
}