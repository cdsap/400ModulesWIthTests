package com.awesomeapp.module_2_209

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api209_33 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api209_33 API"
    }
}