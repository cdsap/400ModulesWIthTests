package com.awesomeapp.module_2_164

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api164_31 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api164_31 API"
    }
}