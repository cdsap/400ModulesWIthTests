package com.awesomeapp.module_1_123

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository123_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository123_2 Repository"
    }
}