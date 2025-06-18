package com.awesomeapp.module_4_349

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository349_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository349_2 Repository"
    }
}