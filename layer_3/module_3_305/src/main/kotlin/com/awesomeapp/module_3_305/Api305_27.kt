package com.awesomeapp.module_3_305

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api305_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api305_27 API"
    }
}