package com.awesomeapp.module_3_298

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository298_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository298_2 Repository"
    }
}