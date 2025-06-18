package com.awesomeapp.module_3_276

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository276_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository276_2 Repository"
    }
}