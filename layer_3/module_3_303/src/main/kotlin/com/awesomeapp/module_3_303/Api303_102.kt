package com.awesomeapp.module_3_303

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api303_102 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api303_102 API"
    }
}