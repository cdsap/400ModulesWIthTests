package com.awesomeapp.module_2_168

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository168_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository168_2 Repository"
    }
}