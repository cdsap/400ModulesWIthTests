package com.awesomeapp.module_0_35

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository35_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository35_2 Repository"
    }
}