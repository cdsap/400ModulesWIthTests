package com.awesomeapp.module_3_300

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository300_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository300_2 Repository"
    }
}