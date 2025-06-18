package com.awesomeapp.module_2_238

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository238_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository238_2 Repository"
    }
}