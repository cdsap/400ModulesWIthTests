package com.awesomeapp.module_2_209

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api209_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api209_51 API"
    }
}