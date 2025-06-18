package com.awesomeapp.module_3_275

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api275_33 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api275_33 API"
    }
}