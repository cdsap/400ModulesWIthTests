package com.awesomeapp.module_3_254

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository254_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository254_2 Repository"
    }
}