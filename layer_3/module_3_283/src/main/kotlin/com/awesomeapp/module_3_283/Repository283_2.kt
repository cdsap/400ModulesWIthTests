package com.awesomeapp.module_3_283

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository283_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository283_2 Repository"
    }
}