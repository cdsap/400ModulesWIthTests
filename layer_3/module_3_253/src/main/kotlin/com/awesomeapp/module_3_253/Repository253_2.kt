package com.awesomeapp.module_3_253

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository253_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository253_2 Repository"
    }
}