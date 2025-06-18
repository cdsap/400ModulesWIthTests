package com.awesomeapp.module_1_119

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api119_87 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api119_87 API"
    }
}