package com.awesomeapp.module_1_116

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository116_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository116_2 Repository"
    }
}