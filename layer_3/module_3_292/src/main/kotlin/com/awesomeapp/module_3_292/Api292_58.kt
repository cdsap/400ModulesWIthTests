package com.awesomeapp.module_3_292

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api292_58 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api292_58 API"
    }
}