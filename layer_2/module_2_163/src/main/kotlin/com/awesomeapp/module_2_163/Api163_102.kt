package com.awesomeapp.module_2_163

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api163_102 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api163_102 API"
    }
}