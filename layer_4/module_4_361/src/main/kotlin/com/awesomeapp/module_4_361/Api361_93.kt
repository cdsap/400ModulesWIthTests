package com.awesomeapp.module_4_361

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api361_93 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api361_93 API"
    }
}