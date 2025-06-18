package com.awesomeapp.module_3_308

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository308_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository308_2 Repository"
    }
}