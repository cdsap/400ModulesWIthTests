package com.awesomeapp.module_1_106

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository106_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository106_2 Repository"
    }
}