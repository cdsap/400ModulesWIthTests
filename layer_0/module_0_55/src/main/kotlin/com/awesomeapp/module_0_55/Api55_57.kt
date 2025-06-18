package com.awesomeapp.module_0_55

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api55_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api55_57 API"
    }
}