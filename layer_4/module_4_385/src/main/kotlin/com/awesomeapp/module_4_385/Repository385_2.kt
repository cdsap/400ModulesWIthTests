package com.awesomeapp.module_4_385

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository385_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository385_2 Repository"
    }
}