package com.awesomeapp.module_0_36

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api36_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api36_3 API"
    }
}