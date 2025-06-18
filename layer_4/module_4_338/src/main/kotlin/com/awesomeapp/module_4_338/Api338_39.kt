package com.awesomeapp.module_4_338

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api338_39 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api338_39 API"
    }
}