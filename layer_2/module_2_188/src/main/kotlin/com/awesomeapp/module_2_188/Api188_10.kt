package com.awesomeapp.module_2_188

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api188_10 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api188_10 API"
    }
}