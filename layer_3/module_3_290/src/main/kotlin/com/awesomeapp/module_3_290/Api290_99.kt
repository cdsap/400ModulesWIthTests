package com.awesomeapp.module_3_290

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api290_99 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api290_99 API"
    }
}