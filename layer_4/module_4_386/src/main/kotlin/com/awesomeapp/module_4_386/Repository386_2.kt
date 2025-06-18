package com.awesomeapp.module_4_386

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository386_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository386_2 Repository"
    }
}