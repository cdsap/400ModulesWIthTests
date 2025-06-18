package com.awesomeapp.module_0_52

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository52_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository52_2 Repository"
    }
}