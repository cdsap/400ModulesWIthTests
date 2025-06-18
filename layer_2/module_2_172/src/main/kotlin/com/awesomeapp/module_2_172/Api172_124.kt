package com.awesomeapp.module_2_172

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api172_124 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api172_124 API"
    }
}