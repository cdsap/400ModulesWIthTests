package com.awesomeapp.module_4_394

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api394_39 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api394_39 API"
    }
}