package com.awesomeapp.module_2_191

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository191_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository191_2 Repository"
    }
}