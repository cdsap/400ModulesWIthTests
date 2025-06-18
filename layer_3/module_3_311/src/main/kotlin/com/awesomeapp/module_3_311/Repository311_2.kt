package com.awesomeapp.module_3_311

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository311_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository311_2 Repository"
    }
}