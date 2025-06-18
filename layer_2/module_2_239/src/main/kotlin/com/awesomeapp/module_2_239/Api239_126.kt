package com.awesomeapp.module_2_239

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api239_126 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api239_126 API"
    }
}