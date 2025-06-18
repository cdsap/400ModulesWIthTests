package com.awesomeapp.module_0_35

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api35_66 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api35_66 API"
    }
}