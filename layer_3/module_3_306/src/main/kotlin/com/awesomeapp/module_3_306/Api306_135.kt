package com.awesomeapp.module_3_306

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api306_135 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api306_135 API"
    }
}