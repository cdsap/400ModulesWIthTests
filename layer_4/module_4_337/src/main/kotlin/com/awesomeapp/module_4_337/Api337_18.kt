package com.awesomeapp.module_4_337

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api337_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api337_18 API"
    }
}