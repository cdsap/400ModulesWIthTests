package com.awesomeapp.module_1_153

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository153_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository153_2 Repository"
    }
}