package com.awesomeapp.module_4_333

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository333_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository333_2 Repository"
    }
}