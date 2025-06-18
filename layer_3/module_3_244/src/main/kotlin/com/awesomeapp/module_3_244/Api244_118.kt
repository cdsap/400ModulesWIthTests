package com.awesomeapp.module_3_244

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api244_118 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api244_118 API"
    }
}