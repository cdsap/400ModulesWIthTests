package com.awesomeapp.module_0_58

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api58_87 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api58_87 API"
    }
}