package com.awesomeapp.module_0_53

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api53_90 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api53_90 API"
    }
}