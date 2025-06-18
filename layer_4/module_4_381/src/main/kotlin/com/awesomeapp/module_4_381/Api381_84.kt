package com.awesomeapp.module_4_381

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api381_84 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api381_84 API"
    }
}