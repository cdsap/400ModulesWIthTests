package com.awesomeapp.module_4_338

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository338_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository338_2 Repository"
    }
}