package com.awesomeapp.module_2_214

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api214_114 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api214_114 API"
    }
}