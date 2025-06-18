package com.awesomeapp.module_4_357

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository357_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository357_2 Repository"
    }
}