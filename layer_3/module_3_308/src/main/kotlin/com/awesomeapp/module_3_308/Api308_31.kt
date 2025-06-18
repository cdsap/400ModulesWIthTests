package com.awesomeapp.module_3_308

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api308_31 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api308_31 API"
    }
}