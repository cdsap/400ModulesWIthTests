package com.awesomeapp.module_0_14

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api14_132 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api14_132 API"
    }
}