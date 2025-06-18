package com.awesomeapp.module_1_104

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api104_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api104_3 API"
    }
}