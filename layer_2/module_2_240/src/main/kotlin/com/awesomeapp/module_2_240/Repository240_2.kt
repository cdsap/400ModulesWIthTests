package com.awesomeapp.module_2_240

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository240_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository240_2 Repository"
    }
}