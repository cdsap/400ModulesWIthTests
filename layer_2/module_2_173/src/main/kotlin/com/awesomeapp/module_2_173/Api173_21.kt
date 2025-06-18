package com.awesomeapp.module_2_173

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api173_21 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api173_21 API"
    }
}