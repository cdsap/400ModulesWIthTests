package com.awesomeapp.module_4_351

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository351_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository351_2 Repository"
    }
}