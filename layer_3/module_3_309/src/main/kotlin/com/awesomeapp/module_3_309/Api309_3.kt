package com.awesomeapp.module_3_309

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api309_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api309_3 API"
    }
}