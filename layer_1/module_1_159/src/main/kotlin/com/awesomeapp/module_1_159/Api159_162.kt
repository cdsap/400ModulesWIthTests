package com.awesomeapp.module_1_159

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api159_162 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api159_162 API"
    }
}