package com.awesomeapp.module_2_178

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api178_48 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api178_48 API"
    }
}