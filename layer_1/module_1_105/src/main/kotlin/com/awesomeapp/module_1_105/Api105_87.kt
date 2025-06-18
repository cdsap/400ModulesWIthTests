package com.awesomeapp.module_1_105

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class Api105_87 {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api105_87 API"
    }
}