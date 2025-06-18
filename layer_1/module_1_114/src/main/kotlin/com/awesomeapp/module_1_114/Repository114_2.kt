package com.awesomeapp.module_1_114

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository114_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository114_2 Repository"
    }
}