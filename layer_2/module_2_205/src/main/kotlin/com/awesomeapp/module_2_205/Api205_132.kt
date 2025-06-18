package com.awesomeapp.module_2_205

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api205_132 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api205_132 API"
    }
}