package com.awesomeapp.module_2_175

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api175_126 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api175_126 API"
    }
}