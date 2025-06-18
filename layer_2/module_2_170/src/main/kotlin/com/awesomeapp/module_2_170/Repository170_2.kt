package com.awesomeapp.module_2_170

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository170_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository170_2 Repository"
    }
}