package com.awesomeapp.module_3_263

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api263_15 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api263_15 API"
    }
}