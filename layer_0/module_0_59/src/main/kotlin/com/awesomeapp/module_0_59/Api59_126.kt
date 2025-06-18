package com.awesomeapp.module_0_59

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api59_126 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api59_126 API"
    }
}