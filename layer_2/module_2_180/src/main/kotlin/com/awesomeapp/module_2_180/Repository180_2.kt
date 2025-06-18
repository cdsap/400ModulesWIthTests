package com.awesomeapp.module_2_180

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository180_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository180_2 Repository"
    }
}