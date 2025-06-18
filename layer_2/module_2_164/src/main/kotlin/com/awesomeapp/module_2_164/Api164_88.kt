package com.awesomeapp.module_2_164

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api164_88 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api164_88 API"
    }
}