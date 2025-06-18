package com.awesomeapp.module_2_189

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api189_57 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api189_57 API"
    }
}