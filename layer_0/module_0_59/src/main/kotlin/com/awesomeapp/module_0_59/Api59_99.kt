package com.awesomeapp.module_0_59

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api59_99 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api59_99 API"
    }
}