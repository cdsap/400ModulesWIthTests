package com.awesomeapp.module_2_174

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api174_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api174_27 API"
    }
}