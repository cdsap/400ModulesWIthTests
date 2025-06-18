package com.awesomeapp.module_4_364

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api364_40 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api364_40 API"
    }
}