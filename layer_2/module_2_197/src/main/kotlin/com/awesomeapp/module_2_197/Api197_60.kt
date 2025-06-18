package com.awesomeapp.module_2_197

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api197_60 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api197_60 API"
    }
}