package com.awesomeapp.module_0_80

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api80_34 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api80_34 API"
    }
}