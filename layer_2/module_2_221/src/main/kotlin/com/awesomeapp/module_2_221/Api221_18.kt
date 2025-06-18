package com.awesomeapp.module_2_221

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api221_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api221_18 API"
    }
}