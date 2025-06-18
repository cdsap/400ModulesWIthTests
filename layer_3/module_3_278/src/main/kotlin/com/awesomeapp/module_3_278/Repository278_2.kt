package com.awesomeapp.module_3_278

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository278_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository278_2 Repository"
    }
}