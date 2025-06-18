package com.awesomeapp.module_1_81

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository81_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository81_2 Repository"
    }
}