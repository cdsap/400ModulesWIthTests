package com.awesomeapp.module_0_44

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api44_7 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api44_7 API"
    }
}