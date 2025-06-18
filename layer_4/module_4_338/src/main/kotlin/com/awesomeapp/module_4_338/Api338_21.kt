package com.awesomeapp.module_4_338

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api338_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api338_21 API"
    }
}