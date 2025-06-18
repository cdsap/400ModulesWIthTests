package com.awesomeapp.module_1_91

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository91_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository91_2 Repository"
    }
}