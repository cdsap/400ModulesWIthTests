package com.awesomeapp.module_2_169

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api169_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api169_24 API"
    }
}