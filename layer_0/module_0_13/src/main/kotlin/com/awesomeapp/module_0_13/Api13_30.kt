package com.awesomeapp.module_0_13

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api13_30 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api13_30 API"
    }
}