package com.awesomeapp.module_0_32

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository32_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository32_2 Repository"
    }
}