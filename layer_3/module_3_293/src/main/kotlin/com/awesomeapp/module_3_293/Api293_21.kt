package com.awesomeapp.module_3_293

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api293_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api293_21 API"
    }
}