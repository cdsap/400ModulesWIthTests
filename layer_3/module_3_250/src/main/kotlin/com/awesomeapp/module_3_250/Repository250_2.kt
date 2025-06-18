package com.awesomeapp.module_3_250

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository250_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository250_2 Repository"
    }
}