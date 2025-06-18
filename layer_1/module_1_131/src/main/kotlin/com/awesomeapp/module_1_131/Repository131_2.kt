package com.awesomeapp.module_1_131

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository131_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository131_2 Repository"
    }
}