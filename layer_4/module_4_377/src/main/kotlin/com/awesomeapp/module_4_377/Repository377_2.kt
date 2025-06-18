package com.awesomeapp.module_4_377

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository377_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository377_2 Repository"
    }
}