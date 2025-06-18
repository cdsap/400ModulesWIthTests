package com.awesomeapp.module_0_13

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository13_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository13_2 Repository"
    }
}