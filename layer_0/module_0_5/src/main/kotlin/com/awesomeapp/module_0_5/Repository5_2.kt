package com.awesomeapp.module_0_5

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository5_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository5_2 Repository"
    }
}