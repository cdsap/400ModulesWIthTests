package com.awesomeapp.module_2_222

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository222_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository222_2 Repository"
    }
}