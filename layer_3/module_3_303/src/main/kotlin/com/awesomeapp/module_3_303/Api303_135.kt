package com.awesomeapp.module_3_303

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api303_135 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api303_135 API"
    }
}