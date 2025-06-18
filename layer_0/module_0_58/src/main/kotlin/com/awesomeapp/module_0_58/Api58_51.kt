package com.awesomeapp.module_0_58

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api58_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api58_51 API"
    }
}