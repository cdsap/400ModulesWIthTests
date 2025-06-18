package com.awesomeapp.module_1_87

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository87_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository87_2 Repository"
    }
}