package com.awesomeapp.module_2_233

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository233_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository233_2 Repository"
    }
}