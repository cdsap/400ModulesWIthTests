package com.awesomeapp.module_0_20

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api20_61 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api20_61 API"
    }
}