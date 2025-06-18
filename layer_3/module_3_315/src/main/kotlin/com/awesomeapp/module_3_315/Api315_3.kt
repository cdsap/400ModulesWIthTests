package com.awesomeapp.module_3_315

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api315_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api315_3 API"
    }
}