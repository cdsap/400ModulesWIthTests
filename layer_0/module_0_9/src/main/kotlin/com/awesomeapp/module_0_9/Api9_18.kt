package com.awesomeapp.module_0_9

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api9_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api9_18 API"
    }
}