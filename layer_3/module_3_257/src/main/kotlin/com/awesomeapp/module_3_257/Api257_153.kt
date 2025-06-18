package com.awesomeapp.module_3_257

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api257_153 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api257_153 API"
    }
}