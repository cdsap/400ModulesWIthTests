package com.awesomeapp.module_3_271

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api271_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api271_6 API"
    }
}