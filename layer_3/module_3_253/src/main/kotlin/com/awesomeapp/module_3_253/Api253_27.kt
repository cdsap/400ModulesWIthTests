package com.awesomeapp.module_3_253

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api253_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api253_27 API"
    }
}