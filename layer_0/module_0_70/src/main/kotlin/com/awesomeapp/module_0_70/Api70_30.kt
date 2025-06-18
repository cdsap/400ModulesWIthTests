package com.awesomeapp.module_0_70

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api70_30 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api70_30 API"
    }
}