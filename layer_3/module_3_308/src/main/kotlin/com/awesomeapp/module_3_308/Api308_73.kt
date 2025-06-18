package com.awesomeapp.module_3_308

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api308_73 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api308_73 API"
    }
}