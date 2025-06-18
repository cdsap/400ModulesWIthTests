package com.awesomeapp.module_1_140

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository140_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository140_2 Repository"
    }
}