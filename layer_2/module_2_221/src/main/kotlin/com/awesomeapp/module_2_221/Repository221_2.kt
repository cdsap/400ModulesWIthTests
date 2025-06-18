package com.awesomeapp.module_2_221

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository221_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository221_2 Repository"
    }
}