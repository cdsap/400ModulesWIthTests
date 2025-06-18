package com.awesomeapp.module_4_367

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api367_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api367_24 API"
    }
}