package com.awesomeapp.module_1_106

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api106_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api106_27 API"
    }
}