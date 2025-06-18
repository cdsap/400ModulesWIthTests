package com.awesomeapp.module_3_291

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api291_48 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api291_48 API"
    }
}