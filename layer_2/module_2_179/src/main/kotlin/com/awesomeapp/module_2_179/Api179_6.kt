package com.awesomeapp.module_2_179

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api179_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api179_6 API"
    }
}