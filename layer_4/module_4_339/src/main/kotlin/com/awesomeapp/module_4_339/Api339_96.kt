package com.awesomeapp.module_4_339

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api339_96 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api339_96 API"
    }
}