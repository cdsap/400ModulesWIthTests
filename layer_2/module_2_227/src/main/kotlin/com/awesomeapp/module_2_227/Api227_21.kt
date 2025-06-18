package com.awesomeapp.module_2_227

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api227_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api227_21 API"
    }
}