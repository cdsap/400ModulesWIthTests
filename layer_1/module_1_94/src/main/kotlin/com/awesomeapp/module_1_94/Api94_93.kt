package com.awesomeapp.module_1_94

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api94_93 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api94_93 API"
    }
}