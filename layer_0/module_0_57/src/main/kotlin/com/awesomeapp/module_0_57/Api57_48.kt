package com.awesomeapp.module_0_57

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api57_48 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api57_48 API"
    }
}