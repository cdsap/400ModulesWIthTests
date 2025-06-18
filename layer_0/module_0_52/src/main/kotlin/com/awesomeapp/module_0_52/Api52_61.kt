package com.awesomeapp.module_0_52

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api52_61 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api52_61 API"
    }
}