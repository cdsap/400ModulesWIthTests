package com.awesomeapp.module_3_310

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository310_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository310_2 Repository"
    }
}