package com.awesomeapp.module_4_361

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository361_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository361_2 Repository"
    }
}