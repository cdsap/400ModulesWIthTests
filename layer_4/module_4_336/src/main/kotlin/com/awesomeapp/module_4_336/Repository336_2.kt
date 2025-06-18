package com.awesomeapp.module_4_336

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository336_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository336_2 Repository"
    }
}