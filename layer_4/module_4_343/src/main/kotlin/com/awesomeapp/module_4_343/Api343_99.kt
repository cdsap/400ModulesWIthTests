package com.awesomeapp.module_4_343

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api343_99 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api343_99 API"
    }
}