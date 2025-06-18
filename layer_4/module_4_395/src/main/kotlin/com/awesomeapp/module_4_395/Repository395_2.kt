package com.awesomeapp.module_4_395

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository395_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository395_2 Repository"
    }
}