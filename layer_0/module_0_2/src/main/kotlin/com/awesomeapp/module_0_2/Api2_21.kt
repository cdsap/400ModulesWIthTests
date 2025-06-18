package com.awesomeapp.module_0_2

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api2_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api2_21 API"
    }
}