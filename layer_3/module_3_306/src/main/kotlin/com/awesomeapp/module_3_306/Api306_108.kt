package com.awesomeapp.module_3_306

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api306_108 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api306_108 API"
    }
}