package com.awesomeapp.module_1_147

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api147_120 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api147_120 API"
    }
}