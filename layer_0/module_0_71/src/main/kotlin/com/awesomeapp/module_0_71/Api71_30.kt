package com.awesomeapp.module_0_71

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api71_30 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api71_30 API"
    }
}