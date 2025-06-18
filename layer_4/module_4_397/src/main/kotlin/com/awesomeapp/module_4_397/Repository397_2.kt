package com.awesomeapp.module_4_397

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository397_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository397_2 Repository"
    }
}