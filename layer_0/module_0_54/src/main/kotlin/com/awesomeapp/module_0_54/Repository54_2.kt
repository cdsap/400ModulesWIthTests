package com.awesomeapp.module_0_54

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository54_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository54_2 Repository"
    }
}