package com.awesomeapp.module_2_178

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api178_102 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api178_102 API"
    }
}