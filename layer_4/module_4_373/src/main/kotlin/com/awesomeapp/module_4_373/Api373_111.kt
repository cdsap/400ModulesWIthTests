package com.awesomeapp.module_4_373

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api373_111 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api373_111 API"
    }
}