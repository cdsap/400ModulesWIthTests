package com.awesomeapp.module_2_236

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository236_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository236_2 Repository"
    }
}