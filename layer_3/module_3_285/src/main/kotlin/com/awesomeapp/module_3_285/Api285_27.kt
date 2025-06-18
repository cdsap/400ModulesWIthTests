package com.awesomeapp.module_3_285

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api285_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api285_27 API"
    }
}