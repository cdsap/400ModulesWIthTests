package com.awesomeapp.module_4_338

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api338_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api338_42 API"
    }
}