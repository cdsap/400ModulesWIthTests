package com.awesomeapp.module_3_260

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository260_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository260_2 Repository"
    }
}