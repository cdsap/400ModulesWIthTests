package com.awesomeapp.module_2_235

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api235_126 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api235_126 API"
    }
}