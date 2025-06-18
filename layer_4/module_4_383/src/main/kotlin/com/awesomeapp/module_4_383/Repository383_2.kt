package com.awesomeapp.module_4_383

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository383_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository383_2 Repository"
    }
}