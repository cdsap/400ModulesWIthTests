package com.awesomeapp.module_0_15

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository15_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository15_2 Repository"
    }
}