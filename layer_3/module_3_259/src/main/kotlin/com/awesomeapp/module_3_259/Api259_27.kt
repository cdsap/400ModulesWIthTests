package com.awesomeapp.module_3_259

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api259_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api259_27 API"
    }
}