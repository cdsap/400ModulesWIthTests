package com.awesomeapp.module_4_384

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository384_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository384_2 Repository"
    }
}