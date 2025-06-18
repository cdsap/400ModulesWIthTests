package com.awesomeapp.module_4_388

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api388_22 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api388_22 API"
    }
}