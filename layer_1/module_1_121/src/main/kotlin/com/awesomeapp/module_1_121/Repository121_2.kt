package com.awesomeapp.module_1_121

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository121_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository121_2 Repository"
    }
}