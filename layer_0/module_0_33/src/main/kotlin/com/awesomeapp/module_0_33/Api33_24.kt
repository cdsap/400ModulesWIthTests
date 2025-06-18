package com.awesomeapp.module_0_33

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api33_24 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api33_24 API"
    }
}