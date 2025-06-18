package com.awesomeapp.module_1_137

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository137_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository137_2 Repository"
    }
}