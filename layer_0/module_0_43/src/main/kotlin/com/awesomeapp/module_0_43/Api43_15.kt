package com.awesomeapp.module_0_43

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api43_15 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api43_15 API"
    }
}