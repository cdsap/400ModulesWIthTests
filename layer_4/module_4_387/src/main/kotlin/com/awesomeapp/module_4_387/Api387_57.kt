package com.awesomeapp.module_4_387

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api387_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api387_57 API"
    }
}