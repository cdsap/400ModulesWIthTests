package com.awesomeapp.module_1_128

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository128_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository128_2 Repository"
    }
}