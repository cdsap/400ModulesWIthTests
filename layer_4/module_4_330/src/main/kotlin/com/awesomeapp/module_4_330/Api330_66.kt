package com.awesomeapp.module_4_330

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api330_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api330_66 API"
    }
}