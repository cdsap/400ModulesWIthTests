package com.awesomeapp.module_3_265

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository265_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository265_2 Repository"
    }
}