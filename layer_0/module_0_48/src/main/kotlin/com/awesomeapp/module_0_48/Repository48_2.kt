package com.awesomeapp.module_0_48

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository48_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository48_2 Repository"
    }
}