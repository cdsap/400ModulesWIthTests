package com.awesomeapp.module_4_370

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api370_63 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api370_63 API"
    }
}