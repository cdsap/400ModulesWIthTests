package com.awesomeapp.module_3_268

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository268_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository268_2 Repository"
    }
}