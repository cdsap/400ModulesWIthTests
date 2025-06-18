package com.awesomeapp.module_1_158

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository158_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository158_2 Repository"
    }
}