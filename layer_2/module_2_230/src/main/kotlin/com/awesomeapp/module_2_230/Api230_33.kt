package com.awesomeapp.module_2_230

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api230_33 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api230_33 API"
    }
}