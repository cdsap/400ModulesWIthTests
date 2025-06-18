package com.awesomeapp.module_0_59

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api59_72 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api59_72 API"
    }
}