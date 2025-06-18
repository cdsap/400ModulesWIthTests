package com.awesomeapp.module_2_182

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository182_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository182_2 Repository"
    }
}