package com.awesomeapp.module_4_363

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api363_126 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api363_126 API"
    }
}