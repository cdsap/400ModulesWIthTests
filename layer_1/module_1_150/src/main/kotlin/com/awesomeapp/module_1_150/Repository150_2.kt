package com.awesomeapp.module_1_150

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository150_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository150_2 Repository"
    }
}