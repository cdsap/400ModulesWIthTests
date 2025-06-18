package com.awesomeapp.module_4_347

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository347_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository347_2 Repository"
    }
}