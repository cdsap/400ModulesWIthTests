package com.awesomeapp.module_3_291

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api291_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api291_18 API"
    }
}