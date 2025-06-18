package com.awesomeapp.module_4_382

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository382_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository382_2 Repository"
    }
}