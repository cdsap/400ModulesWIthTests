package com.awesomeapp.module_3_314

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api314_39 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api314_39 API"
    }
}