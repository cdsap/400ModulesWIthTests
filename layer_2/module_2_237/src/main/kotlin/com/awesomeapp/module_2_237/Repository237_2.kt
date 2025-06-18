package com.awesomeapp.module_2_237

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository237_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository237_2 Repository"
    }
}