package com.awesomeapp.module_2_205

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository205_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository205_2 Repository"
    }
}