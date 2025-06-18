package com.awesomeapp.module_1_107

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api107_42 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api107_42 API"
    }
}