package com.awesomeapp.module_1_95

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository95_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository95_2 Repository"
    }
}