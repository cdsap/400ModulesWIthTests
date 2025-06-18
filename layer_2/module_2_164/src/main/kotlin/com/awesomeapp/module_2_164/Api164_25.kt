package com.awesomeapp.module_2_164

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api164_25 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api164_25 API"
    }
}