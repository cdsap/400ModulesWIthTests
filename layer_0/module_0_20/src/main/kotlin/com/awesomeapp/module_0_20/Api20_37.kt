package com.awesomeapp.module_0_20

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api20_37 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api20_37 API"
    }
}