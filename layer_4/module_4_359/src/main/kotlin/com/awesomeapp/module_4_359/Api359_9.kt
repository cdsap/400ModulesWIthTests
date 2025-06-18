package com.awesomeapp.module_4_359

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api359_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api359_9 API"
    }
}