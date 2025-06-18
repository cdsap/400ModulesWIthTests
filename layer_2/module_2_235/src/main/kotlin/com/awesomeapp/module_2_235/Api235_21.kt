package com.awesomeapp.module_2_235

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api235_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api235_21 API"
    }
}