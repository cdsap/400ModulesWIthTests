package com.awesomeapp.module_0_64

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository64_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository64_2 Repository"
    }
}