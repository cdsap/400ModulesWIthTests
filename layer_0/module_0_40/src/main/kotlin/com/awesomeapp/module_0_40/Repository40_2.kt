package com.awesomeapp.module_0_40

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository40_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository40_2 Repository"
    }
}