package com.awesomeapp.module_3_297

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api297_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api297_42 API"
    }
}