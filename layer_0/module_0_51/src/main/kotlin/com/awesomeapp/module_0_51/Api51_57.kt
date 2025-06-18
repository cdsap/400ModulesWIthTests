package com.awesomeapp.module_0_51

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api51_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api51_57 API"
    }
}