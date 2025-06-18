package com.awesomeapp.module_1_134

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository134_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository134_2 Repository"
    }
}