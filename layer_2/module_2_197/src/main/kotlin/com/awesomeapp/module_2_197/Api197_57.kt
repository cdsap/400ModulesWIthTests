package com.awesomeapp.module_2_197

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api197_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api197_57 API"
    }
}