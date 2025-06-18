package com.awesomeapp.module_3_270

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository270_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository270_2 Repository"
    }
}