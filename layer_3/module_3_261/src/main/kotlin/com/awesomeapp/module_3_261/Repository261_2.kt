package com.awesomeapp.module_3_261

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository261_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository261_2 Repository"
    }
}