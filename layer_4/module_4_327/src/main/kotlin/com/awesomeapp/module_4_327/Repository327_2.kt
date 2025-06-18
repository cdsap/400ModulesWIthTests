package com.awesomeapp.module_4_327

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository327_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository327_2 Repository"
    }
}