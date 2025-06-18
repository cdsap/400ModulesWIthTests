package com.awesomeapp.module_2_162

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository162_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository162_2 Repository"
    }
}