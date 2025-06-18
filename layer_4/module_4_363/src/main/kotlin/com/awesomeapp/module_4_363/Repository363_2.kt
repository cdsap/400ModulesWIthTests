package com.awesomeapp.module_4_363

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository363_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository363_2 Repository"
    }
}