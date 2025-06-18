package com.awesomeapp.module_3_319

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository319_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository319_2 Repository"
    }
}