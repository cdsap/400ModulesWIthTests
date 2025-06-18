package com.awesomeapp.module_1_113

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository113_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository113_2 Repository"
    }
}