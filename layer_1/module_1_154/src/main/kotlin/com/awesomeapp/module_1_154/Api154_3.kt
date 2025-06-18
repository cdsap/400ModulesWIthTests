package com.awesomeapp.module_1_154

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api154_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api154_3 API"
    }
}