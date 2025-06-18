package com.awesomeapp.module_4_386

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api386_27 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api386_27 API"
    }
}