package com.awesomeapp.module_4_382

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api382_63 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api382_63 API"
    }
}