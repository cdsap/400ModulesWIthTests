package com.awesomeapp.module_1_112

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api112_127 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api112_127 API"
    }
}