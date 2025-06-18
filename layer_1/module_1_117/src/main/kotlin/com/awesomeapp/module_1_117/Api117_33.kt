package com.awesomeapp.module_1_117

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api117_33 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api117_33 API"
    }
}