package com.awesomeapp.module_0_18

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository18_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository18_2 Repository"
    }
}