package com.awesomeapp.module_3_289

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api289_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api289_66 API"
    }
}