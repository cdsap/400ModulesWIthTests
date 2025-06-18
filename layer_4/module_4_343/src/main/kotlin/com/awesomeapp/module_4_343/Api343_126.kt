package com.awesomeapp.module_4_343

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api343_126 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api343_126 API"
    }
}