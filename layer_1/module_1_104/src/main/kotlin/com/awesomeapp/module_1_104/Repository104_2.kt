package com.awesomeapp.module_1_104

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository104_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository104_2 Repository"
    }
}