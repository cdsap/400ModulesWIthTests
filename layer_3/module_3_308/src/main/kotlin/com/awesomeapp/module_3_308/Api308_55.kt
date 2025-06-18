package com.awesomeapp.module_3_308

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api308_55 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api308_55 API"
    }
}