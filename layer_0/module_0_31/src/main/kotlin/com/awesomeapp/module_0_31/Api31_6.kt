package com.awesomeapp.module_0_31

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api31_6 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api31_6 API"
    }
}