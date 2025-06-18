package com.awesomeapp.module_0_79

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository79_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository79_2 Repository"
    }
}