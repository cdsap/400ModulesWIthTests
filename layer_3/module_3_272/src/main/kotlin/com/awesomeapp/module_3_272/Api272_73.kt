package com.awesomeapp.module_3_272

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api272_73 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api272_73 API"
    }
}