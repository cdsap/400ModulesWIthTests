package com.awesomeapp.module_0_64

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api64_52 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api64_52 API"
    }
}