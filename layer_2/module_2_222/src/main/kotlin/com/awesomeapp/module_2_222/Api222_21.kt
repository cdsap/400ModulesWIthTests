package com.awesomeapp.module_2_222

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api222_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api222_21 API"
    }
}