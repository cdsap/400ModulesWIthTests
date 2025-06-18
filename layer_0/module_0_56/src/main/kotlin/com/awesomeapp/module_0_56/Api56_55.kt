package com.awesomeapp.module_0_56

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api56_55 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api56_55 API"
    }
}