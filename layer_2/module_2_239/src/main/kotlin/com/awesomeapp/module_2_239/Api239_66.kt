package com.awesomeapp.module_2_239

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api239_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api239_66 API"
    }
}