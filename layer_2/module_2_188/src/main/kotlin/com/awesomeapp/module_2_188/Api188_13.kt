package com.awesomeapp.module_2_188

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api188_13 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api188_13 API"
    }
}