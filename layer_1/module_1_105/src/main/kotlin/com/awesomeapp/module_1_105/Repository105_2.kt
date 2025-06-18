package com.awesomeapp.module_1_105

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository105_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository105_2 Repository"
    }
}