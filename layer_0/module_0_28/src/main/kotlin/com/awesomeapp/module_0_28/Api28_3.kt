package com.awesomeapp.module_0_28

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api28_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api28_3 API"
    }
}