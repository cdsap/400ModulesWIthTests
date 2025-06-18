package com.awesomeapp.module_4_348

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository348_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository348_2 Repository"
    }
}