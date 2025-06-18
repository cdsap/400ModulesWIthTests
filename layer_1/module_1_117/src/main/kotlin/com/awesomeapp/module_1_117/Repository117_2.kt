package com.awesomeapp.module_1_117

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository117_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository117_2 Repository"
    }
}