package com.awesomeapp.module_4_343

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository343_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository343_2 Repository"
    }
}