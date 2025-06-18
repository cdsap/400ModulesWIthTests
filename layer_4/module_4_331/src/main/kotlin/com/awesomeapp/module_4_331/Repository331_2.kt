package com.awesomeapp.module_4_331

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository331_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository331_2 Repository"
    }
}