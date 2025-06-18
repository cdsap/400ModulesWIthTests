package com.awesomeapp.module_2_204

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository204_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository204_2 Repository"
    }
}