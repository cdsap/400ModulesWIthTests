package com.awesomeapp.module_4_365

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository365_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository365_2 Repository"
    }
}