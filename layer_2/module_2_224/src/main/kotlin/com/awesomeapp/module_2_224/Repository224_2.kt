package com.awesomeapp.module_2_224

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Repository224_2(
    
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        "Data from Repository224_2 Repository"
    }
}