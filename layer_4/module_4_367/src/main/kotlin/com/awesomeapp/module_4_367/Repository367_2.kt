package com.awesomeapp.module_4_367

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository367_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository367_2 Repository"
    }
}