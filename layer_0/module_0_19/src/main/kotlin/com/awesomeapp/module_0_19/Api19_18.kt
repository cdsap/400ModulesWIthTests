package com.awesomeapp.module_0_19

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api19_18 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api19_18 API"
    }
}