package com.awesomeapp.module_1_110

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository110_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository110_2 Repository"
    }
}