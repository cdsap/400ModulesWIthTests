package com.awesomeapp.module_0_76

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository76_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository76_2 Repository"
    }
}