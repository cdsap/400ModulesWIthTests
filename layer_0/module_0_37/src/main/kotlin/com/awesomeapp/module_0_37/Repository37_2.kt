package com.awesomeapp.module_0_37

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository37_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository37_2 Repository"
    }
}