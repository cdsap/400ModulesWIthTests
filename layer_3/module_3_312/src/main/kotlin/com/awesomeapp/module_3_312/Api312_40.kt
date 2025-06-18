package com.awesomeapp.module_3_312

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api312_40 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api312_40 API"
    }
}