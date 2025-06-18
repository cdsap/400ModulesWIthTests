package com.awesomeapp.module_0_4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api4_40 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api4_40 API"
    }
}