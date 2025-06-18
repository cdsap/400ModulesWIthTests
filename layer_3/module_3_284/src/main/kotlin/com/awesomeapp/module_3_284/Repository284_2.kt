package com.awesomeapp.module_3_284

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository284_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository284_2 Repository"
    }
}