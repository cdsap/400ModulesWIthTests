package com.awesomeapp.module_4_326

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository326_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository326_2 Repository"
    }
}