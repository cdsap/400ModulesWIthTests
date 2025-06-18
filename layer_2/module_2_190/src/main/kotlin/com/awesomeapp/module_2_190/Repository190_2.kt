package com.awesomeapp.module_2_190

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository190_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository190_2 Repository"
    }
}