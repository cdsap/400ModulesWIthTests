package com.awesomeapp.module_1_94

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository94_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository94_2 Repository"
    }
}