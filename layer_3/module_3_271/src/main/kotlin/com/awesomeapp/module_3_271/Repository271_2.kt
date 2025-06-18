package com.awesomeapp.module_3_271

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository271_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository271_2 Repository"
    }
}