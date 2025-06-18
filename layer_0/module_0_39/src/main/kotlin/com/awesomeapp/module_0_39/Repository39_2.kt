package com.awesomeapp.module_0_39

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository39_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository39_2 Repository"
    }
}