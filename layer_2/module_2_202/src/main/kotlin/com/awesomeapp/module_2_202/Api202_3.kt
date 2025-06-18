package com.awesomeapp.module_2_202

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api202_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api202_3 API"
    }
}