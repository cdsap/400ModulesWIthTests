package com.awesomeapp.module_2_229

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api229_81 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api229_81 API"
    }
}