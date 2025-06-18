package com.awesomeapp.module_3_304

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository304_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository304_2 Repository"
    }
}