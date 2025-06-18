package com.awesomeapp.module_0_27

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api27_54 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api27_54 API"
    }
}