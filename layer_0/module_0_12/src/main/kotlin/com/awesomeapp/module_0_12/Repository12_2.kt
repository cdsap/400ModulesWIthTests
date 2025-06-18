package com.awesomeapp.module_0_12

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository12_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository12_2 Repository"
    }
}