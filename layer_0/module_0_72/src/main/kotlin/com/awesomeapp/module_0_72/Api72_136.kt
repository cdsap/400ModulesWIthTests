package com.awesomeapp.module_0_72

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api72_136 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api72_136 API"
    }
}