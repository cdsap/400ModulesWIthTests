package com.awesomeapp.module_1_159

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api159_141 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api159_141 API"
    }
}