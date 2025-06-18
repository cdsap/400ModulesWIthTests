package com.awesomeapp.module_2_226

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository226_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository226_2 Repository"
    }
}