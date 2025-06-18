package com.awesomeapp.module_0_17

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository17_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository17_2 Repository"
    }
}