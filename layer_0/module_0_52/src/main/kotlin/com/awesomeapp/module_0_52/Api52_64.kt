package com.awesomeapp.module_0_52

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api52_64 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api52_64 API"
    }
}