package com.awesomeapp.module_1_109

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api109_150 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api109_150 API"
    }
}