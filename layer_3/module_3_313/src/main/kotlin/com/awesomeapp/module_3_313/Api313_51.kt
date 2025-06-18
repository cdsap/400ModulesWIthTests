package com.awesomeapp.module_3_313

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api313_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api313_51 API"
    }
}