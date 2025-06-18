package com.awesomeapp.module_1_111

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api111_93 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api111_93 API"
    }
}