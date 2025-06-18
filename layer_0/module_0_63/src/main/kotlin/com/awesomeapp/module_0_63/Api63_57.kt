package com.awesomeapp.module_0_63

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api63_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api63_57 API"
    }
}