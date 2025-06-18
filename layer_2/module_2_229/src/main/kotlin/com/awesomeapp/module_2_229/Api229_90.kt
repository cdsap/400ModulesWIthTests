package com.awesomeapp.module_2_229

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api229_90 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api229_90 API"
    }
}