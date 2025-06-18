package com.awesomeapp.module_0_32

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api32_10 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api32_10 API"
    }
}