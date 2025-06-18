package com.awesomeapp.module_0_29

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api29_126 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api29_126 API"
    }
}