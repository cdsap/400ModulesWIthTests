package com.awesomeapp.module_4_371

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository371_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository371_2 Repository"
    }
}