package com.awesomeapp.module_4_356

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api356_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api356_3 API"
    }
}