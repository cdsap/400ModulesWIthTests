package com.awesomeapp.module_0_43

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api43_45 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api43_45 API"
    }
}