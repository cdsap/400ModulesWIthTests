package com.awesomeapp.module_0_46

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api46_81 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api46_81 API"
    }
}