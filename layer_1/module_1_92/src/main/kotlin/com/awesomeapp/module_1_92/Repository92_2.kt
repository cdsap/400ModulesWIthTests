package com.awesomeapp.module_1_92

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository92_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository92_2 Repository"
    }
}