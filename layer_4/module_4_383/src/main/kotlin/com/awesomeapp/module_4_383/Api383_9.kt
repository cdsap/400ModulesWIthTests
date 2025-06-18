package com.awesomeapp.module_4_383

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api383_9 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api383_9 API"
    }
}