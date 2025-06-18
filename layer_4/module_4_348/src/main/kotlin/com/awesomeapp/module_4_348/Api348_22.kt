package com.awesomeapp.module_4_348

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api348_22 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api348_22 API"
    }
}