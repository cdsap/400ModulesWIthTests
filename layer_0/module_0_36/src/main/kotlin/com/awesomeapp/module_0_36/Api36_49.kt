package com.awesomeapp.module_0_36

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api36_49 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api36_49 API"
    }
}