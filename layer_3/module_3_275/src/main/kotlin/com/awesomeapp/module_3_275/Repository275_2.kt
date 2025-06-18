package com.awesomeapp.module_3_275

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository275_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository275_2 Repository"
    }
}