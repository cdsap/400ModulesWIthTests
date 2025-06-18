package com.awesomeapp.module_0_56

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository56_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository56_2 Repository"
    }
}