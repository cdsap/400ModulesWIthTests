package com.awesomeapp.module_0_78

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api78_87 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api78_87 API"
    }
}