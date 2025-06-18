package com.awesomeapp.module_2_175

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api175_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api175_18 API"
    }
}