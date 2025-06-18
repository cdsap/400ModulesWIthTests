package com.awesomeapp.module_1_83

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository83_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository83_2 Repository"
    }
}