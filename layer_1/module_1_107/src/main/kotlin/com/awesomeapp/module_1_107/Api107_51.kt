package com.awesomeapp.module_1_107

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api107_51 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api107_51 API"
    }
}