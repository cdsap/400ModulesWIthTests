package com.awesomeapp.module_4_331

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api331_75 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api331_75 API"
    }
}