package com.awesomeapp.module_1_102

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository102_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository102_2 Repository"
    }
}