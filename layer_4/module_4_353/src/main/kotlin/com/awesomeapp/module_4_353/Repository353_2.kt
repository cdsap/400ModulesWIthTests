package com.awesomeapp.module_4_353

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository353_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository353_2 Repository"
    }
}