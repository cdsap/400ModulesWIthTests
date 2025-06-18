package com.awesomeapp.module_4_392

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository392_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository392_2 Repository"
    }
}