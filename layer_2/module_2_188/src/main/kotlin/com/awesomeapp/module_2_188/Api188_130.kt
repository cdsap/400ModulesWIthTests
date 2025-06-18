package com.awesomeapp.module_2_188

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api188_130 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api188_130 API"
    }
}