package com.awesomeapp.module_0_33

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api33_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api33_51 API"
    }
}