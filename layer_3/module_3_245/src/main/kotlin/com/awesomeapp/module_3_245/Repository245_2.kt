package com.awesomeapp.module_3_245

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository245_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository245_2 Repository"
    }
}