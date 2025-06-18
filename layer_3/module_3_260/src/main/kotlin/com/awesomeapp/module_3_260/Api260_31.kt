package com.awesomeapp.module_3_260

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api260_31 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api260_31 API"
    }
}