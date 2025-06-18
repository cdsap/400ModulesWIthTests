package com.awesomeapp.module_3_297

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api297_93 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api297_93 API"
    }
}