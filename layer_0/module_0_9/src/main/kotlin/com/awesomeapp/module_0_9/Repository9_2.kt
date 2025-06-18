package com.awesomeapp.module_0_9

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository9_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository9_2 Repository"
    }
}