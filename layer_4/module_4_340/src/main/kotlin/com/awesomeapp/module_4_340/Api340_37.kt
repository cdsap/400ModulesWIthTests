package com.awesomeapp.module_4_340

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api340_37 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api340_37 API"
    }
}