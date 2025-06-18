package com.awesomeapp.module_1_147

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api147_108 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api147_108 API"
    }
}