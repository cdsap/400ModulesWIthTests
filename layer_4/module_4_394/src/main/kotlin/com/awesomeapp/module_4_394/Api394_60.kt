package com.awesomeapp.module_4_394

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api394_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api394_60 API"
    }
}