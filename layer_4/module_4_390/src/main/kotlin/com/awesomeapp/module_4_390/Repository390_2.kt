package com.awesomeapp.module_4_390

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository390_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository390_2 Repository"
    }
}