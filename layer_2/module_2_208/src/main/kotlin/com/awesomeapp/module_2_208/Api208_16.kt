package com.awesomeapp.module_2_208

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api208_16 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api208_16 API"
    }
}