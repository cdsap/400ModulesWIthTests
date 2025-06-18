package com.awesomeapp.module_1_85

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api85_3 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api85_3 API"
    }
}