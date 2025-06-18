package com.awesomeapp.module_3_317

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository317_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository317_2 Repository"
    }
}