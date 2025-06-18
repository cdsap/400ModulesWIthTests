package com.awesomeapp.module_3_247

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository247_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository247_2 Repository"
    }
}